package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agxd implements defpackage.afhz {
    final /* synthetic */ android.net.Uri a;
    final /* synthetic */ java.lang.String[] b;
    final /* synthetic */ java.lang.String c;
    final /* synthetic */ java.lang.String[] d;
    final /* synthetic */ java.lang.String e;
    final /* synthetic */ defpackage.aogc f;

    public agxd(defpackage.aogc aogcVar, android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        this.a = uri;
        this.b = strArr;
        this.c = str;
        this.d = strArr2;
        this.e = str2;
        j$.util.Objects.requireNonNull(aogcVar);
        this.f = aogcVar;
    }

    @Override // defpackage.afhz
    public final android.database.Cursor a(android.os.CancellationSignal cancellationSignal) {
        return ((defpackage.apni) this.f.c).n(this.a, this.b, this.c, this.d, this.e, cancellationSignal);
    }

    @Override // defpackage.afhz
    public final java.lang.String b() {
        return defpackage.apni.r(this.b, this.a, this.c, this.e);
    }

    @Override // defpackage.afhz
    public final void c() {
    }
}
