package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class waw {
    private static final aimz a = aimz.i("com/android/dialer/wear/crossdevicemetrics/impl/CrossDeviceMetricsWearMetricsStorage");
    private defpackage.wak b;
    private final apdp c = new apdp();

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.wau wauVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.wau) {
            wauVar = (defpackage.wau) aolnVar;
            int i = wauVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wauVar.c = i - Integer.MIN_VALUE;
            } else {
                wauVar = new defpackage.wau(this, aolnVar);
            }
        } else {
            wauVar = new defpackage.wau(this, aolnVar);
        }
        java.lang.Object obj = wauVar.a;
        defpackage.wak wakVar = aolu.a;
        int i2 = wauVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.c;
                wauVar.d = apdpVar2;
                wauVar.c = 1;
                if (apdpVar2.b(wauVar) != wakVar) {
                    apdpVar = apdpVar2;
                }
                return wakVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = wauVar.d;
            aooc.af(obj);
            a.b().l("com/android/dialer/wear/crossdevicemetrics/impl/CrossDeviceMetricsWearMetricsStorage", "getWearMetricsInformation$<anonymous>", 31, "CrossDeviceMetricsWearMetricsStorage.kt").v("Getting WearMetricsInformation.");
            wakVar = this.b;
            return wakVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object b(defpackage.wak wakVar, aoln aolnVar) {
        defpackage.wav wavVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.wav) {
            wavVar = (defpackage.wav) aolnVar;
            int i = wavVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wavVar.c = i - Integer.MIN_VALUE;
            } else {
                wavVar = new defpackage.wav(this, aolnVar);
            }
        } else {
            wavVar = new defpackage.wav(this, aolnVar);
        }
        java.lang.Object obj = wavVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wavVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            apdpVar = this.c;
            wavVar.d = wakVar;
            wavVar.e = apdpVar;
            wavVar.c = 1;
            if (apdpVar.b(wavVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = wavVar.e;
            defpackage.wak wakVar2 = wavVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            wakVar = wakVar2;
        }
        try {
            a.b().l("com/android/dialer/wear/crossdevicemetrics/impl/CrossDeviceMetricsWearMetricsStorage", "setWearMetricsInformation$<anonymous>", 23, "CrossDeviceMetricsWearMetricsStorage.kt").v("Setting WearMetricsInformation.");
            this.b = wakVar;
            return aojh.a;
        } finally {
            apdpVar.d();
        }
    }
}
