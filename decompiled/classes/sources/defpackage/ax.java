package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ax implements defpackage.dxw {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ax(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.dxw
    public final void accept(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                ((defpackage.az) this.a).e.aD();
                break;
            case 1:
                ((defpackage.az) this.a).e.aD();
                break;
            case 2:
                android.content.res.Configuration configuration = (android.content.res.Configuration) obj;
                defpackage.bo boVar = (defpackage.bo) this.a;
                if (boVar.aa()) {
                    boVar.s(configuration, false);
                }
                break;
            case 3:
                java.lang.Integer num = (java.lang.Integer) obj;
                defpackage.bo boVar2 = (defpackage.bo) this.a;
                if (boVar2.aa() && num.intValue() == 80) {
                    boVar2.v(false);
                    break;
                }
                break;
            case 4:
                xhk xhkVar = (xhk) obj;
                defpackage.bo boVar3 = (defpackage.bo) this.a;
                if (boVar3.aa()) {
                    boVar3.w(xhkVar.a, false);
                }
                break;
            case 5:
                xhk xhkVar2 = (xhk) obj;
                defpackage.bo boVar4 = (defpackage.bo) this.a;
                if (boVar4.aa()) {
                    boVar4.B(xhkVar2.a, false);
                }
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                super/*android.widget.TextView*/.setTypeface((android.graphics.Typeface) obj);
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.aowj) this.a).b((java.util.List) obj);
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.rki rkiVar = (defpackage.rki) obj;
                if (rkiVar == null) {
                    defpackage.aooh.i("splitInfo");
                }
                if (rkiVar.b) {
                    defpackage.rqi rqiVar = (defpackage.rqi) this.a;
                    rqiVar.f(rqiVar.b.N());
                }
                break;
            default:
                defpackage.ils ilsVar = (defpackage.ils) obj;
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.zjz.a.c()).k((java.lang.Throwable) ilsVar.a)).i(defpackage.zct.a).l("com/google/android/dialershared/externals/tiktokapis/contrib/work/TikTokWorkManagerModule", "provideTikTokWorkManagerClientConfiguration$<anonymous>", 42, "TikTokWorkManagerModule.kt")).y("WorkManager worker execution failed for worker: %s", this.a.get(defpackage.agvl.b((androidx.work.WorkerParameters) ilsVar.b)));
                break;
        }
    }
}
