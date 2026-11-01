package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xpt implements defpackage.xpa {
    private final java.lang.String a;
    private final java.lang.String b;
    private final java.util.Map c;

    public xpt(java.lang.String str, java.lang.String str2, java.util.Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString("NAME", this.a);
        persistableBundle.putString("CANONICAL_NAME", this.b);
        defpackage.xfh.j(persistableBundle, "DATA", this.c, new defpackage.xpk(defpackage.xpp.a, defpackage.xpm.a));
        return persistableBundle;
    }
}
