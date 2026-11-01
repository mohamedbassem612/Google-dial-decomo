package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aojx extends aojo implements java.util.RandomAccess {
    final /* synthetic */ byte[] a;

    public aojx(byte[] bArr) {
        this.a = bArr;
    }

    public final int a() {
        return this.a.length;
    }

    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Byte)) {
            return false;
        }
        byte bByteValue = ((java.lang.Number) obj).byteValue();
        byte[] bArr = this.a;
        aooh.f(bArr, "<this>");
        return ajsz.cH(bArr, bByteValue) >= 0;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Byte.valueOf(this.a[i]);
    }

    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Byte)) {
            return -1;
        }
        return ajsz.cH(this.a, ((java.lang.Number) obj).byteValue());
    }

    public final boolean isEmpty() {
        return this.a.length == 0;
    }

    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Byte)) {
            return -1;
        }
        byte bByteValue = ((java.lang.Number) obj).byteValue();
        byte[] bArr = this.a;
        aooh.f(bArr, "<this>");
        int length = bArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (bByteValue == bArr[length]) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }
}
