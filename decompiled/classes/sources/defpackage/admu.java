package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class admu implements defpackage.adlc {
    private final defpackage.tvn a;

    public admu(defpackage.tvn tvnVar) {
        this.a = tvnVar;
    }

    @Override // defpackage.adlc
    public final void a(defpackage.adhw adhwVar, java.lang.String str, com.google.android.libraries.micore.superpacks.base.VersionedName versionedName, long j) {
        this.a.P(new adky(adhwVar, str, versionedName, j, 3));
    }

    @Override // defpackage.adlc
    public final void b(defpackage.adhw adhwVar, java.lang.String str, com.google.android.libraries.micore.superpacks.base.VersionedName versionedName, java.lang.Throwable th) {
        this.a.P(new defpackage.admt(adhwVar, str, versionedName, th, 0));
    }

    @Override // defpackage.adlc
    public final void c(defpackage.adhw adhwVar, java.lang.String str, com.google.android.libraries.micore.superpacks.base.VersionedName versionedName, long j, long j2) {
        this.a.P(new admr(adhwVar, str, versionedName, j, j2));
    }

    @Override // defpackage.adlc
    public final void d(defpackage.adhw adhwVar, java.lang.String str, com.google.android.libraries.micore.superpacks.base.VersionedName versionedName, long j, defpackage.adib adibVar) {
        this.a.P(new defpackage.admq(adhwVar, str, versionedName, j, adibVar, 0));
    }

    @Override // defpackage.adlc
    public final void e(defpackage.adhw adhwVar, java.lang.String str, com.google.android.libraries.micore.superpacks.base.VersionedName versionedName, long j) {
        this.a.P(new adky(adhwVar, str, versionedName, j, 2));
    }

    @Override // defpackage.adlc
    public final void f(defpackage.adhw adhwVar, boolean z) {
        this.a.P(new adms(adhwVar, z));
    }

    @Override // defpackage.adlc
    public final void g() {
        throw null;
    }
}
