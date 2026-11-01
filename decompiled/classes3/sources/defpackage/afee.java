package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afee extends afff {
    public static final /* synthetic */ int a = 0;
    private final java.util.List b;

    public afee(java.io.OutputStream outputStream, java.util.List list) {
        super(outputStream);
        this.b = list;
    }

    public final void close() {
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            try {
                ((defpackage.affx) it.next()).close();
            } catch (java.lang.Throwable unused) {
            }
        }
        super.close();
    }

    public final void write(int i) throws java.io.IOException {
        this.out.write(i);
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((defpackage.affx) it.next()).a(1);
        }
    }

    public final void write(byte[] bArr) throws java.io.IOException {
        this.out.write(bArr);
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((defpackage.affx) it.next()).a(bArr.length);
        }
    }

    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.out.write(bArr, i, i2);
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((defpackage.affx) it.next()).a(i2);
        }
    }
}
