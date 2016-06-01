/*-
 * Copyright (C) 2006 Erik Larsson
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.takari.jdkget.osx.dmg.udif;

import java.io.PrintStream;

/** This class was generated by CStructToJavaClass. */
public class Koly {
  private static final int KOLY_FOURCC = 0x6B6F6C79; // ASCII: 'koly'
  /*
   * struct Koly
   * size: 512 bytes
   * description: 
   *
   * BP   Size   Type       Identifier            Description
   * --------------------------------------------------------
   * 0    4      UInt32     fourCC                           
   * 4    1*28   byte[28]   unknown1                         
   * 32   8      UInt64     plistBegin1                      
   * 40   8      UInt64     plistEndSometimes                
   * 48   8      UInt64     unknown2                         
   * 56   8      UInt64     unknown3                         
   * 64   8      UInt64     unknown4                         
   * 72   8      UInt64     unknown5                         
   * 80   8      UInt64     possibleChecksumType             
   * 88   4      UInt32     unknown6                         
   * 92   4      UInt32     possibleUnitSize                 
   * 96   1*120  byte[120]  unknown7                         
   * 216  8      UInt64     plistBegin2                      
   * 224  8      UInt64     plistSize                        
   * 232  1*120  byte[120]  unknown8                         
   * 352  4      UInt32     checksumAlgorithm                
   * 356  4      UInt32     checksumSize                     
   * 360  1*152  byte[152]  checksumData                     
   */

  private final byte[] fourCC = new byte[4];
  private final byte[] unknown1 = new byte[1 * 28];
  private final byte[] plistBegin1 = new byte[8];
  private final byte[] plistEndSometimes = new byte[8];
  private final byte[] unknown2 = new byte[8];
  private final byte[] unknown3 = new byte[8];
  private final byte[] unknown4 = new byte[8];
  private final byte[] unknown5 = new byte[8];
  private final byte[] possibleChecksumType = new byte[8];
  private final byte[] unknown6 = new byte[4];
  private final byte[] possibleUnitSize = new byte[4];
  private final byte[] unknown7 = new byte[1 * 120];
  private final byte[] plistBegin2 = new byte[8];
  private final byte[] plistSize = new byte[8];
  private final byte[] unknown8 = new byte[1 * 120];
  private final byte[] checksumAlgorithm = new byte[4];
  private final byte[] checksumSize = new byte[4];
  private final byte[] checksumData = new byte[1 * 152];

  public Koly(byte[] data, int offset) {
    System.arraycopy(data, offset + 0, fourCC, 0, 4);
    System.arraycopy(data, offset + 4, unknown1, 0, 1 * 28);
    System.arraycopy(data, offset + 32, plistBegin1, 0, 8);
    System.arraycopy(data, offset + 40, plistEndSometimes, 0, 8);
    System.arraycopy(data, offset + 48, unknown2, 0, 8);
    System.arraycopy(data, offset + 56, unknown3, 0, 8);
    System.arraycopy(data, offset + 64, unknown4, 0, 8);
    System.arraycopy(data, offset + 72, unknown5, 0, 8);
    System.arraycopy(data, offset + 80, possibleChecksumType, 0, 8);
    System.arraycopy(data, offset + 88, unknown6, 0, 4);
    System.arraycopy(data, offset + 92, possibleUnitSize, 0, 4);
    System.arraycopy(data, offset + 96, unknown7, 0, 1 * 120);
    System.arraycopy(data, offset + 216, plistBegin2, 0, 8);
    System.arraycopy(data, offset + 224, plistSize, 0, 8);
    System.arraycopy(data, offset + 232, unknown8, 0, 1 * 120);
    System.arraycopy(data, offset + 352, checksumAlgorithm, 0, 4);
    System.arraycopy(data, offset + 356, checksumSize, 0, 4);
    System.arraycopy(data, offset + 360, checksumData, 0, 1 * 152);
  }

  public static int length() {
    return 512;
  }

  public int getFourCC() {
    return io.takari.jdkget.osx.util.Util.readIntBE(fourCC);
  }

  public byte[] getUnknown1() {
    return io.takari.jdkget.osx.util.Util.createCopy(unknown1);
  }

  public long getPlistBegin1() {
    return io.takari.jdkget.osx.util.Util.readLongBE(plistBegin1);
  }

  public long getPlistEndSometimes() {
    return io.takari.jdkget.osx.util.Util.readLongBE(plistEndSometimes);
  }

  public long getUnknown2() {
    return io.takari.jdkget.osx.util.Util.readLongBE(unknown2);
  }

  public long getUnknown3() {
    return io.takari.jdkget.osx.util.Util.readLongBE(unknown3);
  }

  public long getUnknown4() {
    return io.takari.jdkget.osx.util.Util.readLongBE(unknown4);
  }

  public long getUnknown5() {
    return io.takari.jdkget.osx.util.Util.readLongBE(unknown5);
  }

  public long getPossibleChecksumType() {
    return io.takari.jdkget.osx.util.Util.readLongBE(possibleChecksumType);
  }

  public int getUnknown6() {
    return io.takari.jdkget.osx.util.Util.readIntBE(unknown6);
  }

  public int getPossibleUnitSize() {
    return io.takari.jdkget.osx.util.Util.readIntBE(possibleUnitSize);
  }

  public byte[] getUnknown7() {
    return io.takari.jdkget.osx.util.Util.createCopy(unknown7);
  }

  public long getPlistBegin2() {
    return io.takari.jdkget.osx.util.Util.readLongBE(plistBegin2);
  }

  public long getPlistSize() {
    return io.takari.jdkget.osx.util.Util.readLongBE(plistSize);
  }

  public byte[] getUnknown8() {
    return io.takari.jdkget.osx.util.Util.createCopy(unknown8);
  }

  public int getChecksumAlgorithm() {
    return io.takari.jdkget.osx.util.Util.readIntBE(checksumAlgorithm);
  }

  public int getChecksumSize() {
    return io.takari.jdkget.osx.util.Util.readIntBE(checksumSize);
  }

  public byte[] getChecksumData() {
    return io.takari.jdkget.osx.util.Util.createCopy(checksumData);
  }

  public boolean isValid() {
    return getFourCC() == KOLY_FOURCC;
  }

  public void printFields(PrintStream ps, String prefix) {
    ps.println(prefix + " fourCC: \"" + io.takari.jdkget.osx.util.Util.toASCIIString(getFourCC()) + "\"");
    ps.println(prefix + " unknown1: 0x" + io.takari.jdkget.osx.util.Util.byteArrayToHexString(getUnknown1()));
    ps.println(prefix + " plistBegin1: " + getPlistBegin1());
    ps.println(prefix + " plistEndSometimes: " + getPlistEndSometimes());
    ps.println(prefix + " unknown2: " + getUnknown2());
    ps.println(prefix + " unknown3: " + getUnknown3());
    ps.println(prefix + " unknown4: " + getUnknown4());
    ps.println(prefix + " unknown5: " + getUnknown5());
    ps.println(prefix + " possibleChecksumType: " + getPossibleChecksumType());
    ps.println(prefix + " unknown6: " + getUnknown6());
    ps.println(prefix + " possibleUnitSize: " + getPossibleUnitSize());
    ps.println(prefix + " unknown7: 0x" + io.takari.jdkget.osx.util.Util.byteArrayToHexString(getUnknown7()));
    ps.println(prefix + " plistBegin2: " + getPlistBegin2());
    ps.println(prefix + " plistSize: " + getPlistSize());
    ps.println(prefix + " unknown8: 0x" + io.takari.jdkget.osx.util.Util.byteArrayToHexString(getUnknown8()));
    ps.println(prefix + " checksumAlgorithm: " + getChecksumAlgorithm());
    int checksumSize = getChecksumSize() / 8;
    byte[] checksumData = getChecksumData();
    ps.println(prefix + " checksumSize: " + checksumSize);
    ps.println(prefix + " checksumData: 0x" + io.takari.jdkget.osx.util.Util.byteArrayToHexString(checksumData, 0, checksumSize)); // checksumSize is in bits
    int i;
    for (i = 0; i + 4 <= (checksumData.length - checksumSize); i += 4)
      ps.println(prefix + " trailing data[" + i + "]: 0x " + io.takari.jdkget.osx.util.Util.byteArrayToHexString(checksumData, checksumSize + i, 4));
    int bytesLeft = i + 4 - (checksumData.length - checksumSize);
    if (bytesLeft > 0 && bytesLeft < 4) {
      System.err.println("bytes left: " + bytesLeft);
      ps.println(prefix + " trailing data[" + i + "]: 0x " + io.takari.jdkget.osx.util.Util.byteArrayToHexString(checksumData, checksumSize + i, (i + 4) - (checksumData.length - checksumSize)));
    }
  }

  public void print(PrintStream ps, String prefix) {
    ps.println(prefix + "Koly:");
    printFields(ps, prefix);
  }

  /** Test main. Reads the last 512 bytes from the input file (args[0]), creates a
  Koly object and calls its print method to display the data. */
  /*
  public static void main(String[] args) throws java.io.IOException {
    byte[] kolyData = new byte[512];
    java.io.RandomAccessFile raf = new java.io.RandomAccessFile(args[0], "r");
    raf.seek(raf.length() - 512);
    if (raf.read(kolyData) != kolyData.length)
      throw new RuntimeException("Could not read entire koly...");
    raf.close();
    Koly k = new Koly(kolyData, 0);
    k.print(System.out, "");
  }
  */
}