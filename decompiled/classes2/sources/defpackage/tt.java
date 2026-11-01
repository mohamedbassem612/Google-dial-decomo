package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class tt extends android.content.ContextWrapper {
    public final nf a;
    public final defpackage.tw b;
    public android.hardware.display.VirtualDisplay c;
    public int d;
    private final defpackage.hwv e;

    protected tt(final ems emsVar, final defpackage.tw twVar) {
        super(null);
        defpackage.hwv hwvVar = new defpackage.hwv();
        this.e = hwvVar;
        this.c = null;
        final int i = 0;
        this.d = 0;
        this.b = twVar;
        final int i2 = 1;
        hwvVar.c(defpackage.tc.class, "app", new defpackage.vg(this) { // from class: tq
            public final /* synthetic */ defpackage.tt a;

            {
                this.a = this;
            }

            @Override // defpackage.vg
            public final defpackage.vf a() {
                int i3 = i2;
                if (i3 == 0) {
                    defpackage.tt ttVar = this.a;
                    j$.util.Objects.requireNonNull(ttVar);
                    defpackage.tw twVar2 = twVar;
                    j$.util.Objects.requireNonNull(twVar2);
                    ems emsVar2 = emsVar;
                    j$.util.Objects.requireNonNull(emsVar2);
                    return new defpackage.zv(ttVar, twVar2, emsVar2);
                }
                if (i3 == 1) {
                    defpackage.tt ttVar2 = this.a;
                    j$.util.Objects.requireNonNull(ttVar2);
                    defpackage.tw twVar3 = twVar;
                    j$.util.Objects.requireNonNull(twVar3);
                    ems emsVar3 = emsVar;
                    j$.util.Objects.requireNonNull(emsVar3);
                    return new defpackage.tc(ttVar2, twVar3, emsVar3);
                }
                defpackage.tt ttVar3 = this.a;
                if (i3 != 2) {
                    j$.util.Objects.requireNonNull(ttVar3);
                    defpackage.tw twVar4 = twVar;
                    j$.util.Objects.requireNonNull(twVar4);
                    ems emsVar4 = emsVar;
                    j$.util.Objects.requireNonNull(emsVar4);
                    return new defpackage.vj(ttVar3, twVar4, emsVar4);
                }
                j$.util.Objects.requireNonNull(ttVar3);
                defpackage.tw twVar5 = twVar;
                j$.util.Objects.requireNonNull(twVar5);
                ems emsVar5 = emsVar;
                j$.util.Objects.requireNonNull(emsVar5);
                return new defpackage.aay(ttVar3, twVar5, emsVar5);
            }
        });
        hwvVar.c(defpackage.zv.class, "navigation", new defpackage.vg(this) { // from class: tq
            public final /* synthetic */ defpackage.tt a;

            {
                this.a = this;
            }

            @Override // defpackage.vg
            public final defpackage.vf a() {
                int i3 = i;
                if (i3 == 0) {
                    defpackage.tt ttVar = this.a;
                    j$.util.Objects.requireNonNull(ttVar);
                    defpackage.tw twVar2 = twVar;
                    j$.util.Objects.requireNonNull(twVar2);
                    ems emsVar2 = emsVar;
                    j$.util.Objects.requireNonNull(emsVar2);
                    return new defpackage.zv(ttVar, twVar2, emsVar2);
                }
                if (i3 == 1) {
                    defpackage.tt ttVar2 = this.a;
                    j$.util.Objects.requireNonNull(ttVar2);
                    defpackage.tw twVar3 = twVar;
                    j$.util.Objects.requireNonNull(twVar3);
                    ems emsVar3 = emsVar;
                    j$.util.Objects.requireNonNull(emsVar3);
                    return new defpackage.tc(ttVar2, twVar3, emsVar3);
                }
                defpackage.tt ttVar3 = this.a;
                if (i3 != 2) {
                    j$.util.Objects.requireNonNull(ttVar3);
                    defpackage.tw twVar4 = twVar;
                    j$.util.Objects.requireNonNull(twVar4);
                    ems emsVar4 = emsVar;
                    j$.util.Objects.requireNonNull(emsVar4);
                    return new defpackage.vj(ttVar3, twVar4, emsVar4);
                }
                j$.util.Objects.requireNonNull(ttVar3);
                defpackage.tw twVar5 = twVar;
                j$.util.Objects.requireNonNull(twVar5);
                ems emsVar5 = emsVar;
                j$.util.Objects.requireNonNull(emsVar5);
                return new defpackage.aay(ttVar3, twVar5, emsVar5);
            }
        });
        hwvVar.c(defpackage.uc.class, "screen", new defpackage.vg(this) { // from class: tr
            public final /* synthetic */ defpackage.tt a;

            {
                this.a = this;
            }

            @Override // defpackage.vg
            public final defpackage.vf a() {
                int i3 = i2;
                if (i3 != 0) {
                    java.lang.Object obj = emsVar;
                    return i3 != 1 ? defpackage.rs.b(this.a, (defpackage.tw) obj) : new defpackage.uc(this.a, (ems) obj);
                }
                return new defpackage.ul();
            }
        });
        hwvVar.c(defpackage.ul.class, "constraints", new defpackage.vg(this) { // from class: tr
            public final /* synthetic */ defpackage.tt a;

            {
                this.a = this;
            }

            @Override // defpackage.vg
            public final defpackage.vf a() {
                int i3 = i;
                if (i3 != 0) {
                    java.lang.Object obj = twVar;
                    return i3 != 1 ? defpackage.rs.b(this.a, (defpackage.tw) obj) : new defpackage.uc(this.a, (ems) obj);
                }
                return new defpackage.ul();
            }
        });
        final int i3 = 2;
        hwvVar.c(defpackage.uv.class, "hardware", new defpackage.vg(this) { // from class: tr
            public final /* synthetic */ defpackage.tt a;

            {
                this.a = this;
            }

            @Override // defpackage.vg
            public final defpackage.vf a() {
                int i4 = i3;
                if (i4 != 0) {
                    java.lang.Object obj = twVar;
                    return i4 != 1 ? defpackage.rs.b(this.a, (defpackage.tw) obj) : new defpackage.uc(this.a, (ems) obj);
                }
                return new defpackage.ul();
            }
        });
        hwvVar.c(defpackage.vh.class, null, new defpackage.vg() { // from class: ts
            @Override // defpackage.vg
            public final defpackage.vf a() {
                return defpackage.rt.b(this.a);
            }
        });
        hwvVar.c(defpackage.aay.class, "suggestion", new defpackage.vg(this) { // from class: tq
            public final /* synthetic */ defpackage.tt a;

            {
                this.a = this;
            }

            @Override // defpackage.vg
            public final defpackage.vf a() {
                int i4 = i3;
                if (i4 == 0) {
                    defpackage.tt ttVar = this.a;
                    j$.util.Objects.requireNonNull(ttVar);
                    defpackage.tw twVar2 = twVar;
                    j$.util.Objects.requireNonNull(twVar2);
                    ems emsVar2 = emsVar;
                    j$.util.Objects.requireNonNull(emsVar2);
                    return new defpackage.zv(ttVar, twVar2, emsVar2);
                }
                if (i4 == 1) {
                    defpackage.tt ttVar2 = this.a;
                    j$.util.Objects.requireNonNull(ttVar2);
                    defpackage.tw twVar3 = twVar;
                    j$.util.Objects.requireNonNull(twVar3);
                    ems emsVar3 = emsVar;
                    j$.util.Objects.requireNonNull(emsVar3);
                    return new defpackage.tc(ttVar2, twVar3, emsVar3);
                }
                defpackage.tt ttVar3 = this.a;
                if (i4 != 2) {
                    j$.util.Objects.requireNonNull(ttVar3);
                    defpackage.tw twVar4 = twVar;
                    j$.util.Objects.requireNonNull(twVar4);
                    ems emsVar4 = emsVar;
                    j$.util.Objects.requireNonNull(emsVar4);
                    return new defpackage.vj(ttVar3, twVar4, emsVar4);
                }
                j$.util.Objects.requireNonNull(ttVar3);
                defpackage.tw twVar5 = twVar;
                j$.util.Objects.requireNonNull(twVar5);
                ems emsVar5 = emsVar;
                j$.util.Objects.requireNonNull(emsVar5);
                return new defpackage.aay(ttVar3, twVar5, emsVar5);
            }
        });
        final int i4 = 3;
        hwvVar.c(defpackage.vj.class, "media_playback", new defpackage.vg(this) { // from class: tq
            public final /* synthetic */ defpackage.tt a;

            {
                this.a = this;
            }

            @Override // defpackage.vg
            public final defpackage.vf a() {
                int i5 = i4;
                if (i5 == 0) {
                    defpackage.tt ttVar = this.a;
                    j$.util.Objects.requireNonNull(ttVar);
                    defpackage.tw twVar2 = twVar;
                    j$.util.Objects.requireNonNull(twVar2);
                    ems emsVar2 = emsVar;
                    j$.util.Objects.requireNonNull(emsVar2);
                    return new defpackage.zv(ttVar, twVar2, emsVar2);
                }
                if (i5 == 1) {
                    defpackage.tt ttVar2 = this.a;
                    j$.util.Objects.requireNonNull(ttVar2);
                    defpackage.tw twVar3 = twVar;
                    j$.util.Objects.requireNonNull(twVar3);
                    ems emsVar3 = emsVar;
                    j$.util.Objects.requireNonNull(emsVar3);
                    return new defpackage.tc(ttVar2, twVar3, emsVar3);
                }
                defpackage.tt ttVar3 = this.a;
                if (i5 != 2) {
                    j$.util.Objects.requireNonNull(ttVar3);
                    defpackage.tw twVar4 = twVar;
                    j$.util.Objects.requireNonNull(twVar4);
                    ems emsVar4 = emsVar;
                    j$.util.Objects.requireNonNull(emsVar4);
                    return new defpackage.vj(ttVar3, twVar4, emsVar4);
                }
                j$.util.Objects.requireNonNull(ttVar3);
                defpackage.tw twVar5 = twVar;
                j$.util.Objects.requireNonNull(twVar5);
                ems emsVar5 = emsVar;
                j$.util.Objects.requireNonNull(emsVar5);
                return new defpackage.aay(ttVar3, twVar5, emsVar5);
            }
        });
        this.a = new nf(new defpackage.jd(this, 13, null));
        emsVar.c(new defpackage.acjb(this, twVar, 1));
    }

    public final java.lang.Object a(java.lang.Class cls) {
        j$.util.Objects.requireNonNull(cls);
        return this.e.b(cls);
    }

    public final void b(android.content.Context context, android.content.res.Configuration configuration) {
        defpackage.abn.a();
        if (getBaseContext() == null) {
            android.hardware.display.VirtualDisplay virtualDisplayCreateVirtualDisplay = ((android.hardware.display.DisplayManager) j$.util.Objects.requireNonNull(context.getSystemService("display"))).createVirtualDisplay("CarAppService", configuration.screenWidthDp, configuration.screenHeightDp, configuration.densityDpi, null, 8);
            this.c = virtualDisplayCreateVirtualDisplay;
            attachBaseContext(context.createDisplayContext(virtualDisplayCreateVirtualDisplay.getDisplay()).createConfigurationContext(configuration));
        }
        c(configuration);
    }

    public final void c(android.content.res.Configuration configuration) {
        defpackage.abn.a();
        if (android.util.Log.isLoggable("CarApp", 3)) {
            android.util.Log.d("CarApp", "Car configuration changed, configuration: " + configuration + ", displayMetrics: " + getResources().getDisplayMetrics());
        }
        getResources().updateConfiguration((android.content.res.Configuration) j$.util.Objects.requireNonNull(configuration), getResources().getDisplayMetrics());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object d() {
        j$.util.Objects.requireNonNull("screen");
        defpackage.hwv hwvVar = this.e;
        java.lang.Class cls = (java.lang.Class) hwvVar.a.get("screen");
        if (cls != null) {
            return hwvVar.b(cls);
        }
        throw new java.lang.IllegalArgumentException("The name 'screen' does not correspond to a car service");
    }
}
