package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class opy implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ opy(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v26, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v34, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v39, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r12v6, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v74, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object a(java.lang.Object obj) {
        aoin aoinVar;
        int i = 20;
        int i2 = 8;
        switch (this.$cid) {
            case 0:
                androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
                aooh.f(activityResult, "result");
                if (activityResult.a == -1) {
                    android.content.Intent intent = activityResult.b;
                    this.a.a(intent != null ? intent.getData() : null);
                } else {
                    defpackage.opz.a.d().l("com/android/dialer/googlephotos/ui/GooglePhotosComposablesKt", "GooglePhotosComposeActivityLauncher$<anonymous>", 20, "GooglePhotosComposables.kt").v("Google Photos activity result was not successful.");
                }
                return aojh.a;
            case 1:
                zmw zmwVar = (zmw) obj;
                aooh.f(zmwVar, "callAudioRoute");
                defpackage.oox.a.b().l("com/android/dialer/gamingmodesupport/service/GamingModeSupportController", "answerCall$<anonymous>", 26, "GamingModeSupportController.kt").v("earpiece audio switched for speaker in gaming mode");
                if (zmwVar.equals(zmw.a)) {
                    ((defpackage.oox) this.a).b.e(zmw.d);
                }
                return aojh.a;
            case 2:
                own ownVar = (own) obj;
                aooh.f(ownVar, "model");
                ahvr.i(pez.an(ownVar), ((oyp) this.a).b);
                return aojh.a;
            case 3:
                own ownVar2 = (own) obj;
                aooh.f(ownVar2, "model");
                ahvr.i(pez.al(ownVar2), ((oyp) this.a).b);
                return aojh.a;
            case 4:
                own ownVar3 = (own) obj;
                aooh.f(ownVar3, "model");
                ahvr.i(pez.am(ownVar3), ((oyp) this.a).b);
                return aojh.a;
            case 5:
                ouj oujVar = (ouj) obj;
                aooh.f(oujVar, "priority");
                pbp pbpVar = (pbp) this.a;
                wjc wjcVarN = pbpVar.n(pbpVar.b());
                if (wjcVarN != null) {
                    aoin aoinVar2 = (aoin) wjcVarN.o.get(oujVar);
                    if (aoinVar2 == null) {
                        throw new java.lang.IllegalStateException(java.lang.String.format("Listener for %s not injected to CallScopeComponent", oujVar.name()));
                    }
                    ((defpackage.ouh) aoinVar2.a()).a();
                    j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((aoin) wjcVarN.g.get(oujVar));
                    if (true == optionalOfNullable.isPresent()) {
                        optionalOfNullable = j$.util.Optional.ofNullable((oyx) ((aoin) optionalOfNullable.get()).a());
                    }
                    if (true == optionalOfNullable.isPresent()) {
                        pat patVar = (pat) ((java.util.concurrent.atomic.AtomicReference) ((defpackage.krv) ((oyx) optionalOfNullable.get()).a).b).get();
                        pbc pbcVar = new pbc();
                        amxr.g(pbcVar);
                        ahgl.b(pbcVar, patVar);
                        optionalOfNullable = j$.util.Optional.ofNullable(pbcVar);
                    }
                    aooh.e(optionalOfNullable, "createChipDialog(...)");
                    defpackage.al alVar = (defpackage.al) aooh.q(optionalOfNullable);
                    if (alVar != null) {
                        alVar.r(pbpVar.c.H().a(), "ChipsDialog");
                    }
                }
                return aojh.a;
            case 6:
                ouj oujVar2 = (ouj) obj;
                aooh.f(oujVar2, "priority");
                pbp pbpVar2 = (pbp) this.a;
                wjc wjcVarN2 = pbpVar2.n(pbpVar2.b());
                if (wjcVarN2 != null && (aoinVar = (aoin) wjcVarN2.h.get(oujVar2)) != null && aoinVar.a() != null) {
                    defpackage.maj majVar = (defpackage.maj) aoinVar.a();
                    ((gpd) majVar.a).i((java.lang.String) majVar.b).b(mce.cZ);
                    majVar.c.o(rmx.kH);
                }
                return aojh.a;
            case 7:
                return a.K((java.lang.String) this.a, (diq) obj);
            case 8:
                bar barVar = (bar) obj;
                aooh.f(barVar, "$this$LazyRow");
                barVar.a((java.lang.Object) null, (java.lang.Object) null, new cja(-1307508313, true, new defpackage.ant(this.a, i)));
                return aojh.a;
            case 9:
                diq diqVar = (diq) obj;
                aooh.f(diqVar, "$this$semantics");
                dfb.o(diqVar, 0);
                java.lang.Object obj2 = this.a;
                if (obj2 != null) {
                    dfb.q(diqVar, (java.lang.String) obj2);
                }
                return aojh.a;
            case 10:
                return ((zms) this.a).e((android.bluetooth.BluetoothDevice) obj);
            case 11:
                return java.lang.Boolean.valueOf(aooh.n((android.bluetooth.BluetoothDevice) obj, this.a));
            case 12:
                diq diqVar2 = (diq) obj;
                aooh.f(diqVar2, "$this$semantics");
                diqVar2.a(peg.a, ((android.net.Uri) this.a).toString());
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aooh.f((plr) obj, "it");
                rdp rdpVar = (rdp) this.a;
                ajcq ajcqVarF = aosv.F((aoss) rdpVar.d, 0, new oxe(rdpVar, (aoln) null, 2), 3);
                ((zpz) rdpVar.c).a(ajcqVarF);
                return ajcqVarF;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                android.widget.ImageView imageView = (android.widget.ImageView) obj;
                aooh.f(imageView, "it");
                imageView.setVisibility(true == ((pom) this.a).f.d ? 0 : 8);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                android.widget.ImageView imageView2 = (android.widget.ImageView) obj;
                aooh.f(imageView2, "it");
                imageView2.setVisibility(true == ((pom) this.a).f.f ? 0 : 8);
                return aojh.a;
            case 16:
                android.widget.TextView textView = (android.widget.TextView) obj;
                aooh.f(textView, "it");
                textView.setText((java.lang.CharSequence) this.a);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                android.widget.TextView textView2 = (android.widget.TextView) obj;
                aooh.f(textView2, "it");
                textView2.setText(android.text.TextUtils.concat(this.a, " • "));
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                android.widget.TextView textView3 = (android.widget.TextView) obj;
                aooh.f(textView3, "it");
                textView3.setText(android.text.TextUtils.concat(" • ", this.a));
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                android.widget.TextView textView4 = (android.widget.TextView) obj;
                aooh.f(textView4, "it");
                java.lang.CharSequence text = textView4.getText();
                if (text != null && text.length() != 0 && !((pnb) this.a).d) {
                    i2 = 0;
                }
                textView4.setVisibility(i2);
                return aojh.a;
            default:
                return pez.aq((android.content.Context) this.a, (java.lang.CharSequence) obj);
        }
    }
}
