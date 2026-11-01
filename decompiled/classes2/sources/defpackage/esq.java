package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class esq extends defpackage.esk {
    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    @Override // defpackage.esj
    public final void e(java.nio.ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.b.d;
        if (i2 == 3) {
            i <<= 1;
        } else if (i2 == 4) {
            i /= 2;
        } else {
            if (i2 != 21) {
                if (i2 == 22) {
                    i /= 2;
                } else if (i2 != 268435456) {
                    if (i2 != 1342177280) {
                        if (i2 == 1610612736) {
                            i /= 2;
                        } else {
                            if (i2 != 1879048192) {
                                if (i2 == 1895825408) {
                                    i /= 2;
                                } else if (i2 != 1912602624) {
                                    throw new java.lang.IllegalStateException();
                                }
                            }
                            i /= 4;
                        }
                    }
                }
            }
            i /= 3;
            i <<= 1;
        }
        java.nio.ByteBuffer byteBufferK = k(i);
        int i3 = this.b.d;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferK.put((byte) 0);
                byteBufferK.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sA = (short) (eum.a(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferK.put((byte) (sA & 255));
                byteBufferK.put((byte) ((sA >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 21) {
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 1));
                byteBufferK.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i3 == 22) {
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 2));
                byteBufferK.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 1));
                byteBufferK.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 1));
                byteBufferK.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else if (i3 == 1610612736) {
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 1));
                byteBufferK.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        } else if (i3 == 1879048192) {
            while (iPosition < iLimit) {
                short sAd = (short) (eum.ad(byteBuffer.getDouble(iPosition)) * 32767.0d);
                byteBufferK.put((byte) (sAd & 255));
                byteBufferK.put((byte) ((sAd >> 8) & 255));
                iPosition += 8;
            }
        } else if (i3 == 1895825408) {
            while (iPosition < iLimit) {
                short sA2 = (short) (eum.a(java.lang.Float.intBitsToFloat(java.lang.Integer.reverseBytes(byteBuffer.getInt(iPosition))), -1.0f, 1.0f) * 32767.0f);
                byteBufferK.put((byte) (sA2 & 255));
                byteBufferK.put((byte) ((sA2 >> 8) & 255));
                iPosition += 4;
            }
        } else {
            if (i3 != 1912602624) {
                throw new java.lang.IllegalStateException();
            }
            while (iPosition < iLimit) {
                short sAd2 = (short) (eum.ad(java.lang.Double.longBitsToDouble(java.lang.Long.reverseBytes(byteBuffer.getLong(iPosition)))) * 32767.0d);
                byteBufferK.put((byte) (sAd2 & 255));
                byteBufferK.put((byte) ((sAd2 >> 8) & 255));
                iPosition += 8;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferK.flip();
    }

    @Override // defpackage.esk
    public final defpackage.esf j(defpackage.esf esfVar) throws defpackage.esi {
        int i = esfVar.d;
        if (eum.U(i)) {
            return i != 2 ? new defpackage.esf(esfVar.b, esfVar.c, 2) : defpackage.esf.a;
        }
        throw new defpackage.esi("Unhandled input format:", esfVar);
    }
}
