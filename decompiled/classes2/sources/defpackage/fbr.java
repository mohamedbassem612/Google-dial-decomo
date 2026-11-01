package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fbr extends defpackage.esk {
    public defpackage.aizh d;
    private defpackage.aizh e;

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00de  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:59:0x0109  */
    /* JADX WARN: Code duplicated, block: B:61:0x0119  */
    @Override // defpackage.esj
    public final void e(java.nio.ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        byte b;
        defpackage.aizh aizhVar = this.e;
        ahvr.ci(aizhVar);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        java.nio.ByteBuffer byteBufferK = k(((iLimit - iPosition) / this.b.e) * this.c.e);
        while (iPosition < iLimit) {
            for (int i5 = 0; i5 < aizhVar.c; i5++) {
                int iJ = (eum.j(this.b.d) * aizhVar.a(i5)) + iPosition;
                int i6 = this.b.d;
                if (i6 == 2) {
                    byteBufferK.putShort(byteBuffer.getShort(iJ));
                } else if (i6 == 3) {
                    byteBufferK.put(byteBuffer.get(iJ));
                } else if (i6 == 4) {
                    byteBufferK.putFloat(byteBuffer.getFloat(iJ));
                } else if (i6 == 21) {
                    if (byteBuffer.order() == java.nio.ByteOrder.BIG_ENDIAN) {
                        i = iJ;
                    } else {
                        i = iJ + 2;
                    }
                    byte b2 = byteBuffer.get(i);
                    byte b3 = byteBuffer.get(iJ + 1);
                    if (byteBuffer.order() == java.nio.ByteOrder.BIG_ENDIAN) {
                        iJ += 2;
                    }
                    i2 = ((b2 << 24) & (-16777216)) | ((b3 << 16) & 16711680) | ((byteBuffer.get(iJ) << 8) & 65280);
                    i3 = i2 >> 8;
                    if (((-16777216) & i3) != 0 || (i3 & (-8388608)) == -8388608) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ahvr.bR(z, "Value out of range of 24-bit integer: %s", java.lang.Integer.toHexString(i3));
                    ahvr.bM(byteBufferK.remaining() >= 3);
                    if (byteBufferK.order() == java.nio.ByteOrder.BIG_ENDIAN) {
                        i4 = (i2 >> 24) & 255;
                    } else {
                        i4 = i3 & 255;
                    }
                    byte b4 = (byte) i4;
                    int i7 = (i2 >> 16) & 255;
                    if (byteBufferK.order() == java.nio.ByteOrder.BIG_ENDIAN) {
                        b = (byte) (i3 & 255);
                    } else {
                        b = (byte) ((i2 >> 24) & 255);
                    }
                    byteBufferK.put(b4).put((byte) i7).put(b);
                } else if (i6 == 22) {
                    byteBufferK.putInt(byteBuffer.getInt(iJ));
                } else if (i6 == 268435456) {
                    byteBufferK.putShort(byteBuffer.getShort(iJ));
                } else if (i6 == 1342177280) {
                    if (byteBuffer.order() == java.nio.ByteOrder.BIG_ENDIAN) {
                        i = iJ;
                    } else {
                        i = iJ + 2;
                    }
                    byte b5 = byteBuffer.get(i);
                    byte b6 = byteBuffer.get(iJ + 1);
                    if (byteBuffer.order() == java.nio.ByteOrder.BIG_ENDIAN) {
                        iJ += 2;
                    }
                    i2 = ((b5 << 24) & (-16777216)) | ((b6 << 16) & 16711680) | ((byteBuffer.get(iJ) << 8) & 65280);
                    i3 = i2 >> 8;
                    if (((-16777216) & i3) != 0) {
                        z = true;
                    } else {
                        z = true;
                    }
                    ahvr.bR(z, "Value out of range of 24-bit integer: %s", java.lang.Integer.toHexString(i3));
                    ahvr.bM(byteBufferK.remaining() >= 3);
                    if (byteBufferK.order() == java.nio.ByteOrder.BIG_ENDIAN) {
                        i4 = (i2 >> 24) & 255;
                    } else {
                        i4 = i3 & 255;
                    }
                    byte b7 = (byte) i4;
                    int i8 = (i2 >> 16) & 255;
                    if (byteBufferK.order() == java.nio.ByteOrder.BIG_ENDIAN) {
                        b = (byte) (i3 & 255);
                    } else {
                        b = (byte) ((i2 >> 24) & 255);
                    }
                    byteBufferK.put(b7).put((byte) i8).put(b);
                } else if (i6 != 1610612736) {
                    if (i6 != 1879048192) {
                        if (i6 == 1895825408) {
                            byteBufferK.putFloat(byteBuffer.getFloat(iJ));
                        } else if (i6 != 1912602624) {
                            throw new java.lang.IllegalStateException(a.bj(i6, "Unexpected encoding: "));
                        }
                    }
                    byteBufferK.putDouble(byteBuffer.getDouble(iJ));
                } else {
                    byteBufferK.putInt(byteBuffer.getInt(iJ));
                }
            }
            iPosition += this.b.e;
        }
        byteBuffer.position(iLimit);
        byteBufferK.flip();
    }

    @Override // defpackage.esk
    public final defpackage.esf j(defpackage.esf esfVar) throws defpackage.esi {
        defpackage.aizh aizhVar = this.d;
        if (aizhVar == null) {
            return defpackage.esf.a;
        }
        int i = esfVar.d;
        if (!eum.U(i)) {
            throw new defpackage.esi("Unhandled input format:", esfVar);
        }
        int i2 = aizhVar.c;
        int i3 = esfVar.c;
        boolean z = i3 != i2;
        int i4 = 0;
        while (i4 < i2) {
            int iA = aizhVar.a(i4);
            if (iA >= i3) {
                throw new defpackage.esi(a.bJ(aizhVar, "Channel map (", ") trying to access non-existent input channel."), esfVar);
            }
            z |= iA != i4;
            i4++;
        }
        return z ? new defpackage.esf(esfVar.b, i2, i) : defpackage.esf.a;
    }

    @Override // defpackage.esk
    protected final void m() {
        this.e = null;
        this.d = null;
    }

    @Override // defpackage.esk
    protected final void o() {
        this.e = this.d;
    }
}
