package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afed extends affe {
    public static final /* synthetic */ int a = 0;
    private final java.util.List b;

    public afed(java.io.InputStream inputStream, java.util.List list) {
        super(inputStream);
        this.b = list;
    }

    public final void close() {
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            try {
                ((defpackage.affw) it.next()).close();
            } catch (java.lang.Throwable unused) {
            }
        }
        super.close();
    }

    public final int read() throws java.io.IOException {
        int i = this.in.read();
        if (i != -1) {
            java.util.Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((defpackage.affw) it.next()).a();
            }
        }
        return i;
    }

    public final int read(byte[] bArr) throws java.io.IOException {
        int i = this.in.read(bArr);
        if (i != -1) {
            java.util.Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((defpackage.affw) it.next()).a();
            }
        }
        return i;
    }

    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.in.read(bArr, i, i2);
        if (i3 != -1) {
            java.util.Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((defpackage.affw) it.next()).a();
            }
        }
        return i3;
    }
}
