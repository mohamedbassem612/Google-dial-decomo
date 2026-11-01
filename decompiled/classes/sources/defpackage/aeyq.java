package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeyq implements java.lang.Comparable {
    public static final /* synthetic */ int b = 0;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater c = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.aeyq.class, java.lang.Object.class, "d");
    public final java.lang.String a;
    private volatile java.lang.Object d;

    public aeyq(java.lang.String str, byte[] bArr) {
        this.a = str;
        this.d = bArr;
    }

    public final void a(byte[] bArr, boolean z) {
        java.lang.Object obj;
        byte[][] bArr2;
        if (z) {
            c.set(this, bArr);
            return;
        }
        int i = 0;
        do {
            obj = this.d;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i >= length) {
                        bArr2 = (byte[][]) java.util.Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (java.util.Arrays.equals(bArr, bArr3[i])) {
                        return;
                    } else {
                        i++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (java.util.Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
        } while (!defpackage.anty.ag(c, this, obj, bArr2));
    }

    public final void b(java.lang.String str, defpackage.aihb aihbVar) {
        java.lang.Object obj = this.d;
        if (obj instanceof byte[]) {
            aihbVar.c(defpackage.gou.z(str, this.a, (byte[]) obj));
            return;
        }
        for (byte[] bArr : (byte[][]) obj) {
            aihbVar.c(defpackage.gou.z(str, this.a, bArr));
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.a.compareTo((java.lang.String) obj);
    }
}
