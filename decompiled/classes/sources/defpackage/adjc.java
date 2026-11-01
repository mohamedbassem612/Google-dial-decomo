package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class adjc {
    public static defpackage.adjb i() {
        defpackage.adjb adjbVar = new defpackage.adjb();
        adjbVar.b(0);
        adjbVar.c(0L);
        adjbVar.e(0);
        adjbVar.g(0);
        adjbVar.f(0L);
        return adjbVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract long d();

    public abstract long e();

    public abstract defpackage.adhw f();

    public abstract com.google.android.libraries.micore.superpacks.base.VersionedName g();

    public abstract java.lang.String h();

    public java.lang.String toString() {
        java.lang.String str;
        defpackage.ahym ahymVar = new defpackage.ahym("");
        ahymVar.c();
        ahymVar.b("name", f());
        int iB = b();
        java.util.Set set = defpackage.adik.a;
        if (iB != 0) {
            str = iB != 1 ? "pinned" : "reserved";
        } else {
            str = "not_res";
        }
        ahymVar.b("state", str);
        ahymVar.f("size", e());
        ahymVar.e("priority", a());
        ahymVar.b("last access", defpackage.adik.c(d()));
        ahymVar.b("source", h());
        ahymVar.e("validation failure", c());
        return ahymVar.toString();
    }
}
