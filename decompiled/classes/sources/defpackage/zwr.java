package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
@java.lang.Deprecated
public final class zwr {
    public final android.content.Context a;
    public final defpackage.ahzi b;

    public zwr(android.content.Context context) {
        this.a = context;
        this.b = defpackage.ahvr.bI(new defpackage.rwp(context, 15));
    }

    public final defpackage.aaum a(java.lang.String str) {
        try {
            android.content.Context context = this.a;
            java.lang.String str2 = defpackage.zwk.a;
            return defpackage.aazc.s(defpackage.zwq.c(context, str));
        } catch (java.io.IOException | defpackage.zwj e) {
            return defpackage.aazc.r(e);
        }
    }
}
