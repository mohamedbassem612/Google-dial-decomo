package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xpm implements defpackage.xpa {
    public static final defpackage.xpl a = new defpackage.xpl();
    public final android.os.PersistableBundle b;

    public xpm(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "persistableBundle");
        this.b = persistableBundle;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.xpm) && defpackage.xff.l(this.b, ((defpackage.xpm) obj).b);
    }

    public final int hashCode() {
        return defpackage.xff.m(this.b);
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = this.b;
        aooh.f(persistableBundle, "value");
        return persistableBundle;
    }

    public final java.lang.String toString() {
        return "PersistablePersistableBundle(" + defpackage.xff.n(this.b) + ')';
    }
}
