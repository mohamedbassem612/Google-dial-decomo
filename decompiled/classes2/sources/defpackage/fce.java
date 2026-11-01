package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fce extends defpackage.esk {
    private static void p(int i, java.nio.ByteBuffer byteBuffer) {
        float f = (float) (((double) i) * 4.656612875245797E-10d);
        byteBuffer.putInt(java.lang.Float.isNaN(f) ? 0 : java.lang.Float.floatToIntBits(f));
    }

    @Override // defpackage.esj
    public final void e(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBufferK;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.b.d;
        if (i2 == 2) {
            byteBufferK = k(i << 1);
            while (iPosition < iLimit) {
                p(byteBuffer.getShort(iPosition) << 16, byteBufferK);
                iPosition += 2;
            }
        } else if (i2 == 3) {
            byteBufferK = k(i << 2);
            while (iPosition < iLimit) {
                p(((byteBuffer.get(iPosition) & 255) - 128) << 24, byteBufferK);
                iPosition++;
            }
        } else if (i2 == 21) {
            byteBufferK = k((i / 3) << 2);
            while (iPosition < iLimit) {
                p((byteBuffer.get(iPosition + 2) << 24) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 8), byteBufferK);
                iPosition += 3;
            }
        } else if (i2 == 22) {
            byteBufferK = k(i);
            while (iPosition < iLimit) {
                p(byteBuffer.getInt(iPosition), byteBufferK);
                iPosition += 4;
            }
        } else if (i2 == 268435456) {
            byteBufferK = k(i << 1);
            while (iPosition < iLimit) {
                p(java.lang.Short.reverseBytes(byteBuffer.getShort(iPosition)) << 16, byteBufferK);
                iPosition += 2;
            }
        } else if (i2 == 1342177280) {
            byteBufferK = k((i / 3) << 2);
            while (iPosition < iLimit) {
                p((byteBuffer.get(iPosition) << 24) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 8), byteBufferK);
                iPosition += 3;
            }
        } else if (i2 == 1610612736) {
            byteBufferK = k(i);
            while (iPosition < iLimit) {
                p(java.lang.Integer.reverseBytes(byteBuffer.getInt(iPosition)), byteBufferK);
                iPosition += 4;
            }
        } else if (i2 == 1879048192) {
            byteBufferK = k(i / 2);
            while (iPosition < iLimit) {
                byteBufferK.putFloat((float) byteBuffer.getDouble(iPosition));
                iPosition += 8;
            }
        } else if (i2 == 1895825408) {
            byteBufferK = k(i);
            while (iPosition < iLimit) {
                byteBufferK.putFloat(java.lang.Float.intBitsToFloat(java.lang.Integer.reverseBytes(byteBuffer.getInt(iPosition))));
                iPosition += 4;
            }
        } else {
            if (i2 != 1912602624) {
                throw new java.lang.IllegalStateException();
            }
            byteBufferK = k(i / 2);
            while (iPosition < iLimit) {
                byteBufferK.putFloat((float) java.lang.Double.longBitsToDouble(java.lang.Long.reverseBytes(byteBuffer.getLong(iPosition))));
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
            return i != 4 ? new defpackage.esf(esfVar.b, esfVar.c, 4) : defpackage.esf.a;
        }
        throw new defpackage.esi("Unhandled input format:", esfVar);
    }
}
