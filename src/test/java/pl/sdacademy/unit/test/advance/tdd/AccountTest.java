package pl.sdacademy.unit.test.advance.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    @Test
    void shouldTransferCorrectAmount() {
        //given
        Account credit = new Account(1000, "111", new Customer("Jan", "Nowak"));
        Account debit = new Account(5000, "222", new Customer("Alina", "Kowalska"));
        //when
        debit.transferMoney(credit, 100);
        //then
        assertEquals(1100, credit.getBalance());
        assertEquals(4900, debit.getBalance());
    }

    @Test
    void shouldNotTransferMoneyWhenAmountIsLessThanZero() {
        //given
        Account credit = new Account(1000, "111", new Customer("Jan", "Nowak"));
        Account debit = new Account(5000, "222", new Customer("Alina", "Kowalska"));
        //when
        debit.transferMoney(credit, -100);
        //then
        assertEquals(1000, credit.getBalance());
        assertEquals(5000, debit.getBalance());
    }

    @Test
    void shouldNotTransferMoneyWhenAmountIsGreaterThanDebitBalance() {
        //given
        Account credit = new Account(1000, "111", new Customer("Jan", "Nowak"));
        Account debit = new Account(5000, "222", new Customer("Alina", "Kowalska"));
        //when
        debit.transferMoney(credit, 6000);
        //then
        assertEquals(1000, credit.getBalance());
        assertEquals(5000, debit.getBalance());
    }

}