package com.android.dialer.voicemail.settings.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class RecordLottieView extends com.airbnb.lottie.LottieAnimationView {
    private static final java.util.EnumMap f;
    private static final java.util.EnumMap g;
    private static final java.util.EnumMap h;
    public defpackage.vtk e;
    private final java.util.EnumMap i;

    static {
        java.util.EnumMap enumMap = new java.util.EnumMap(defpackage.vtk.class);
        f = enumMap;
        java.util.EnumMap enumMap2 = new java.util.EnumMap(defpackage.vtk.class);
        g = enumMap2;
        java.util.EnumMap enumMap3 = new java.util.EnumMap(defpackage.vtk.class);
        h = enumMap3;
        enumMap.put(defpackage.vtk.b, new defpackage.vtl(0, 25));
        enumMap.put(defpackage.vtk.c, new defpackage.vtl(26, 105));
        enumMap.put(defpackage.vtk.d, new defpackage.vtl(106, 10895));
        enumMap2.put(defpackage.vtk.b, new defpackage.vtl(0, 45));
        enumMap2.put(defpackage.vtk.d, new defpackage.vtl(46, 60));
        enumMap2.put(defpackage.vtk.e, new defpackage.vtl(61, 75));
        enumMap2.put(defpackage.vtk.f, new defpackage.vtl(46, 46));
        enumMap3.put(defpackage.vtk.b, new defpackage.vtl(0, 45));
        enumMap3.put(defpackage.vtk.d, new defpackage.vtl(46, 407));
        enumMap3.put(defpackage.vtk.e, new defpackage.vtl(46, 46));
        enumMap3.put(defpackage.vtk.f, new defpackage.vtl(406, 406));
    }

    public RecordLottieView(android.content.Context context) {
        super(context);
        this.i = new java.util.EnumMap(defpackage.vtk.class);
        this.e = defpackage.vtk.a;
        u();
    }

    private final void u() {
        int id = getId();
        if (id == 2131428766) {
            setAccessibilityDelegate(new defpackage.vti(this));
            this.i.putAll(f);
        } else if (id == 2131428688) {
            this.i.putAll(g);
        } else if (id == 2131428692) {
            this.i.putAll(h);
        }
        setSaveEnabled(false);
    }

    final void t(defpackage.vtk vtkVar, defpackage.aprf aprfVar) {
        defpackage.vtl vtlVar = (defpackage.vtl) this.i.get(vtkVar);
        ahvr.ci(vtlVar);
        if (aprfVar != null) {
            a(new defpackage.vtm(this, aprfVar));
        }
        n(vtlVar.a, vtlVar.b);
        e();
        this.e = vtkVar;
        int id = getId();
        int i = 2132017241;
        if (id == 2131428766) {
            if (this.e != defpackage.vtk.d) {
                i = 2132017234;
            }
        } else if (id != 2131428688) {
            i = 0;
        } else if (this.e != defpackage.vtk.d) {
            i = 2132017233;
        }
        if (i != 0) {
            setContentDescription(getResources().getString(i));
        }
    }

    public RecordLottieView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new java.util.EnumMap(defpackage.vtk.class);
        this.e = defpackage.vtk.a;
        u();
    }

    public RecordLottieView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new java.util.EnumMap(defpackage.vtk.class);
        this.e = defpackage.vtk.a;
        u();
    }
}
