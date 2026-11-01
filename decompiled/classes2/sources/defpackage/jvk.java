package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jvk {
    public static final aimz a = aimz.i("com/android/dialer/calleridfeedback/impl/ui/callertagselector/CallerTagSelectorFragmentPeer");
    public final defpackage.jrz b;
    public final defpackage.jvf c;
    public final defpackage.jvd d;
    public final ahpz e;
    public final rlv f;
    public final aca g = new aca();
    public defpackage.jvm h = defpackage.jvm.a;
    public j$.util.Optional i = j$.util.Optional.empty();
    public final agye j = new defpackage.jvh(this);
    public final ajwr k;
    public final uzx l;
    public final ipc m;

    public jvk(defpackage.jrz jrzVar, defpackage.jvf jvfVar, defpackage.jvd jvdVar, ahpz ahpzVar, uzx uzxVar, ajwr ajwrVar, rlv rlvVar, ipc ipcVar) {
        this.b = jrzVar;
        this.c = jvfVar;
        this.d = jvdVar;
        this.e = ahpzVar;
        this.l = uzxVar;
        this.k = ajwrVar;
        this.f = rlvVar;
        this.m = ipcVar;
    }

    public final void a(boolean z) {
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehaviorH = com.google.android.material.bottomsheet.BottomSheetBehavior.h(this.c.c().findViewById(2131427944));
        if (d()) {
            bottomSheetBehaviorH.w = false;
            bottomSheetBehaviorH.t(true != z ? 4 : 3);
        } else {
            bottomSheetBehaviorH.w = true;
            bottomSheetBehaviorH.t(3);
        }
    }

    public final void b() {
        boolean z;
        defpackage.jvf jvfVar = this.c;
        int i = com.google.android.material.bottomsheet.BottomSheetBehavior.h(jvfVar.c().findViewById(2131427944)).y;
        if (i == 3) {
            z = true;
        } else if (i != 4) {
            return;
        } else {
            z = false;
        }
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) jvfVar.N().findViewById(2131428877);
        if (d()) {
            nestedScrollView.setNestedScrollingEnabled(z);
            if (!z) {
                com.google.android.material.appbar.AppBarLayout appBarLayoutFindViewById = jvfVar.N().findViewById(2131429305);
                appBarLayoutFindViewById.o(false);
                appBarLayoutFindViewById.k(true, true, true);
                nestedScrollView.o(33);
            }
            jvfVar.N().findViewById(2131428946).setVisibility(true != z ? 0 : 8);
            android.view.View viewFindViewById = jvfVar.N().findViewById(2131427452);
            int i2 = true != z ? 8 : 0;
            viewFindViewById.setVisibility(i2);
            jvfVar.N().findViewById(2131427453).setVisibility(i2);
        } else {
            nestedScrollView.setNestedScrollingEnabled(true);
        }
        jvfVar.N().findViewById(2131428452).requestLayout();
    }

    public final boolean c() {
        zai zaiVar = this.h.f;
        if (zaiVar == null) {
            zaiVar = zai.a;
        }
        return !zaiVar.equals(zai.a);
    }

    public final boolean d() {
        return !this.h.d.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View, com.android.dialer.calleridfeedback.impl.ui.callertagselector.CallerTagChipView, java.lang.Object] */
    public final com.android.dialer.calleridfeedback.impl.ui.callertagselector.CallerTagChipView e(zai zaiVar, int i) {
        aca acaVar = this.g;
        if (acaVar.containsKey(zaiVar)) {
            return (com.android.dialer.calleridfeedback.impl.ui.callertagselector.CallerTagChipView) acaVar.get(zaiVar);
        }
        defpackage.jvf jvfVar = this.c;
        byte[] bArr = null;
        ?? r2 = (com.android.dialer.calleridfeedback.impl.ui.callertagselector.CallerTagChipView) android.view.View.inflate(jvfVar.z(), 2131624083, null);
        defpackage.juz juzVarY = r2.y();
        juzVarY.g = j$.util.Optional.of(zaiVar);
        juzVarY.b.setText(zaiVar.d);
        if (zai.a.h.equals(zaiVar.h)) {
            defpackage.juz.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/calleridfeedback/impl/ui/callertagselector/CallerTagChipViewPeer", "setTagConfig", 107, "CallerTagChipViewPeer.java").y("Missing MDD icon for tag: %s", zaiVar.b);
            java.lang.String str = zaiVar.f;
            yew yewVar = juzVarY.e;
            ahhp ahhpVar = juzVarY.c;
            ahhpVar.c(yewVar);
            ahhpVar.b().b().e(android.net.Uri.parse(str)).b(yep.b(xwm.b)).k(juzVarY.f);
        } else {
            java.lang.String str2 = zaiVar.h;
            yew yewVar2 = juzVarY.f;
            ahhp ahhpVar2 = juzVarY.c;
            ahhpVar2.c(yewVar2);
            ahhpVar2.b().e(android.net.Uri.parse(str2)).y(juzVarY.d).k(juzVarY.e);
        }
        r2.setOnClickListener(new ahpp(this.e, 173, "Chip clicked", new defpackage.jln(this, 8, bArr), 0));
        (i == 2 ? (com.google.android.material.chip.ChipGroup) jvfVar.N().findViewById(2131427452) : jvfVar.N().findViewById(2131429144)).addView((android.view.View) r2, 0);
        acaVar.put(zaiVar, (java.lang.Object) r2);
        return r2;
    }
}
