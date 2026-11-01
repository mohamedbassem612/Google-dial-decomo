package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class zyw {
    public final android.content.Context a;
    public final java.lang.String b;
    public defpackage.zze c;
    public defpackage.zzv d = defpackage.zzv.a;
    public java.lang.String e;
    public defpackage.zzj f;

    public zyw(android.content.Context context, java.lang.String str) {
        if (context == null) {
            throw new java.lang.NullPointerException("null reference");
        }
        this.a = context;
        defpackage.aais.ap(str);
        this.b = str;
    }

    public final void a(defpackage.zzv zzvVar) {
        if (zzvVar == null) {
            throw new java.lang.NullPointerException("null reference");
        }
        this.d = zzvVar;
        defpackage.zyx.c(zzvVar);
    }
}
