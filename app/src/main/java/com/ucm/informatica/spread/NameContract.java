package com.ucm.informatica.spread;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.6.0.
 */
public class NameContract extends Contract implements Serializable {
    private static final String BINARY = "608060405234801561001057600080fd5b506102a7806100206000396000f30060806040526004361061004b5763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166317d7de7c8114610050578063c47f0027146100da575b600080fd5b34801561005c57600080fd5b50610065610135565b6040805160208082528351818301528351919283929083019185019080838360005b8381101561009f578181015183820152602001610087565b50505050905090810190601f1680156100cc5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b3480156100e657600080fd5b506040805160206004803580820135601f81018490048402850184019095528484526101339436949293602493928401919081908401838280828437509497506101cc9650505050505050565b005b60008054604080516020601f60026000196101006001881615020190951694909404938401819004810282018101909252828152606093909290918301828280156101c15780601f10610196576101008083540402835291602001916101c1565b820191906000526020600020905b8154815290600101906020018083116101a457829003601f168201915b505050505090505b90565b80516101df9060009060208401906101e3565b5050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061022457805160ff1916838001178555610251565b82800160010185558215610251579182015b82811115610251578251825591602001919060010190610236565b5061025d929150610261565b5090565b6101c991905b8082111561025d57600081556001016102675600a165627a7a72305820873abe14e4ef625027cd4cf5f41c8910a60fc7aa4bcad61c0a4da68192febf240029";

    public static final String FUNC_GETNAME = "getName";

    public static final String FUNC_SETNAME = "setName";

    protected NameContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected NameContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }


    public RemoteCall<String> getName() {
        final Function function = new Function(FUNC_GETNAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setName(String n) {
        final Function function = new Function(
                FUNC_SETNAME, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(n)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }
    public static RemoteCall<NameContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(NameContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<NameContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(NameContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static NameContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new NameContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static NameContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new NameContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

}
