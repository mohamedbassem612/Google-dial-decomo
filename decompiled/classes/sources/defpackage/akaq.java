package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akaq extends defpackage.anrt {
    final /* synthetic */ android.content.pm.PackageManager a;
    final /* synthetic */ defpackage.aihd b;
    final /* synthetic */ defpackage.aaco c;

    public akaq(android.content.pm.PackageManager packageManager, defpackage.aihd aihdVar, defpackage.aaco aacoVar) {
        this.a = packageManager;
        this.b = aihdVar;
        this.c = aacoVar;
    }

    @Override // defpackage.anrt
    public final defpackage.anqw a(int i) {
        java.lang.String[] packagesForUid = this.a.getPackagesForUid(i);
        if (packagesForUid != null) {
            for (java.lang.String str : packagesForUid) {
                if (this.b.contains(str)) {
                    return !this.c.c(i) ? defpackage.anqw.f.f("Rejected by (1st-party only Allowlist) security policy. Not google-signed.") : defpackage.anqw.b;
                }
            }
        }
        return defpackage.anqw.f.f("Rejected by (1st-party only Allowlist) security policy. Package not allowed.");
    }
}
