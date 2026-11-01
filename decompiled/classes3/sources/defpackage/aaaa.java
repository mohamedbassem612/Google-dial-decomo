package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaaa implements zzz {
    private final aoin a;

    public aaaa(aoin aoinVar) {
        this.a = aoinVar;
    }

    public final zzd a(android.content.Context context, java.lang.String str) {
        ahyn ahynVar = (ahyn) this.a.b;
        if (!ahynVar.f()) {
            return new zzd(context, "CLIENT_LOGGING_PROD", str);
        }
        java.util.List list = zzd.m;
        zza zzaVar = new zza(context, "CLIENT_LOGGING_PROD");
        zze zzeVar = (zze) ahynVar.e();
        if (zzeVar != null) {
            ((zyw) zzaVar).c = zzeVar;
        }
        if (str != null) {
            ((zyw) zzaVar).e = str;
        }
        return zzaVar.b();
    }
}
