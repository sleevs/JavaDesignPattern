package br.com.jsn.composite;

import br.com.jsn.dto.AccountDTO;

public class AccountElement extends ManagerComponent{


    private AccountDTO accountDTO;

    

    public AccountElement(AccountDTO accountDTO) {
        this.accountDTO = accountDTO;
    }



    @Override
    public Object display() {
        // TODO Auto-generated method stub

        return accountDTO;
    }


    public AccountDTO getAccountDTO() {
        return accountDTO;
    }



    public void setAccountDTO(AccountDTO accountDTO) {
        this.accountDTO = accountDTO;
    }

    

}
