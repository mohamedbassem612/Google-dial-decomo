package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class adld {
    public abstract com.google.android.libraries.micore.superpacks.base.BasePriority a();

    public abstract defpackage.adim b();

    public abstract defpackage.adip c();

    public abstract com.google.android.libraries.micore.superpacks.common.Slice d();

    public abstract defpackage.aigf e();

    public abstract defpackage.admd f();

    public defpackage.adin g() {
        throw null;
    }

    public java.lang.String toString() {
        defpackage.ahym ahymVar = new defpackage.ahym("");
        ahymVar.c();
        ahymVar.b("fetcher", defpackage.agab.cl(c()));
        ahymVar.b("unpacker", defpackage.agab.cl(f()));
        if (!e().isEmpty()) {
            defpackage.ailj it = e().entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                ahymVar.b("validator", ((java.lang.String) entry.getKey()) + ": " + defpackage.agab.cl((defpackage.adkm) entry.getValue()));
            }
        }
        ahymVar.f("size", d().f().d());
        ahymVar.f("compressed", b().a);
        ahymVar.b("scheme", b().b);
        ahymVar.b("params", g());
        return ahymVar.toString();
    }
}
