package com.yearup.dealership;

public class ContractDataManager {
    public class SalesContract extends Contract {
        public static void saveContract(Contract contract) {
            if (contract instanceof SalesContract) {
                writeSaleContractToFile((SalesContract) contract) {

                }
            }
        }

    }


}
