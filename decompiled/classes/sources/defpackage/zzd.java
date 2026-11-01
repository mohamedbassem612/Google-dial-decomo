package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zzd extends defpackage.zyx {
    public static final java.util.List m = new java.util.concurrent.CopyOnWriteArrayList();
    public final zyz n;

    public zzd(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this(context, str, str2, defpackage.zzv.a, 0, new defpackage.aaaf(context), new defpackage.aaak(context), null, null);
    }

    public static defpackage.zza f(android.content.Context context, java.lang.String str) {
        defpackage.zza zzaVar = new defpackage.zza(context, str);
        zzaVar.a(defpackage.zzv.c);
        return zzaVar;
    }

    public static defpackage.zzd i(android.content.Context context, java.lang.String str) {
        defpackage.zza zzaVar = new defpackage.zza(context, str);
        zzaVar.a(defpackage.zzv.b);
        return zzaVar.b();
    }

    public static void j(defpackage.zzb zzbVar) {
        m.add(0, zzbVar);
    }

    public static void k(android.content.Context context, java.lang.String str) {
        f(context, str).b();
    }

    public final defpackage.zzc g(defpackage.albh albhVar) {
        if (albhVar != null) {
            return new defpackage.zzc(this, albhVar);
        }
        throw new java.lang.NullPointerException("null reference");
    }

    @java.lang.Deprecated
    public final defpackage.zzc h(defpackage.albh albhVar, defpackage.zzu zzuVar) {
        if (albhVar == null) {
            throw new java.lang.NullPointerException("null reference");
        }
        defpackage.zzc zzcVar = new defpackage.zzc(this, albhVar);
        if (!defpackage.andp.a.eZ().b(((defpackage.zzd) zzcVar.a).e)) {
            zzcVar.q = zzuVar;
        }
        return zzcVar;
    }

    public zzd(android.content.Context context, java.lang.String str, java.lang.String str2, defpackage.zzv zzvVar, int i, defpackage.zze zzeVar, defpackage.zzq zzqVar, zyz zyzVar, defpackage.zzj zzjVar) {
        super(context, str, str2, zzvVar, i, zzeVar, zzqVar, zzjVar);
        this.n = zyzVar;
    }
}
