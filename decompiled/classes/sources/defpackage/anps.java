package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class anps {
    public defpackage.anpv a(defpackage.anrg anrgVar, defpackage.anpq anpqVar) {
        return b(java.net.URI.create(anrgVar.toString()), anpqVar);
    }

    public abstract defpackage.anpv b(java.net.URI uri, defpackage.anpq anpqVar);

    public abstract java.lang.String c();
}
