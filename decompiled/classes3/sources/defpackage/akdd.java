package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akdd implements zzz {
    public final zzd a(android.content.Context context, java.lang.String str) {
        zzd zzdVar;
        java.util.Map map = defpackage.aaat.a;
        synchronized (map) {
            zzdVar = (zzd) j$.util.Map.-EL.computeIfAbsent(map, str, new defpackage.vxb(context, 16));
        }
        return zzdVar;
    }
}
