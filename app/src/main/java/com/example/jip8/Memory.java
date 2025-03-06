package com.example.jip8;

final class Memory
{
    static final int STATRING_ADDRESS = 0x200;
    static final int MAX_ADDRESS = 0xFFF;
    private static final int TOTAL_SIZE = MAX_ADDRESS - STATRING_ADDRESS + 0x1;

    private static int[] ram = new int[TOTAL_SIZE];

    static int read(int address) throws InvalidMemoryAddressException
    {
        if (address > MAX_ADDRESS || address < STATRING_ADDRESS)
            throw new InvalidMemoryAddressException(address);
        else
            return ram[address - STATRING_ADDRESS];
    }

    static void write(int address, int value) throws InvalidMemoryAddressException
    {
        if (address > MAX_ADDRESS || address < STATRING_ADDRESS)
            throw new InvalidMemoryAddressException(address);
        else
            ram[address - STATRING_ADDRESS] = value;
    }

}
