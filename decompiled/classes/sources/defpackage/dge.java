package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dge implements defpackage.cmy {
    public defpackage.aoss b;
    private final android.content.Context c;
    private defpackage.aoub d;
    private final defpackage.ceg e = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(1.0f);

    public dge(android.content.Context context) {
        this.c = context;
    }

    @Override // defpackage.cmy
    public final float a() {
        defpackage.aozh aozhVar;
        if (this.d == null) {
            android.content.Context context = this.c;
            defpackage.adw adwVar = defpackage.dgx.a;
            synchronized (adwVar) {
                java.lang.Object objA = adwVar.a(context);
                if (objA == null) {
                    android.content.ContentResolver contentResolver = context.getContentResolver();
                    android.net.Uri uriFor = android.provider.Settings.Global.getUriFor("animator_duration_scale");
                    defpackage.aowi aowiVarH = defpackage.aooh.H(-1, 0, null, 6);
                    objA = defpackage.aoov.as(new defpackage.aowy(new dgv(contentResolver, uriFor, new dgw(aowiVarH, ft$.ExternalSyntheticApiModelOutline0.m(android.os.Looper.getMainLooper())), aowiVarH, context, (defpackage.aoln) null)), defpackage.aosv.o(), new defpackage.aozg(0L, Long.MAX_VALUE), java.lang.Float.valueOf(android.provider.Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    adwVar.n(context, objA);
                }
                aozhVar = (defpackage.aozh) objA;
            }
            b(((java.lang.Number) aozhVar.c()).floatValue());
            defpackage.aoss aossVar = this.b;
            if (aossVar == null) {
                throw new java.lang.IllegalStateException("MotionDurationScale scale factor requested before recomposer loop start");
            }
            this.d = defpackage.aoov.an(aossVar, null, 0, new defpackage.bnl(aozhVar, this, (defpackage.aoln) null, 10), 3);
        }
        return this.e.c();
    }

    public final void b(float f) {
        this.e.h(f);
    }

    @Override // defpackage.aolr
    public final java.lang.Object fold(java.lang.Object obj, defpackage.aonn aonnVar) {
        return aonnVar.a(obj, this);
    }

    @Override // defpackage.aolp, defpackage.aolr
    public final defpackage.aolp get(defpackage.aolq aolqVar) {
        return defpackage.ajsz.aq(this, aolqVar);
    }

    @Override // defpackage.aolp
    public final /* synthetic */ defpackage.aolq getKey() {
        return defpackage.cmy.a;
    }

    @Override // defpackage.aolr
    public final defpackage.aolr minusKey(defpackage.aolq aolqVar) {
        return defpackage.ajsz.ar(this, aolqVar);
    }

    @Override // defpackage.aolr
    public final defpackage.aolr plus(defpackage.aolr aolrVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("context");
        }
        return defpackage.ajsz.at(this, aolrVar);
    }
}
