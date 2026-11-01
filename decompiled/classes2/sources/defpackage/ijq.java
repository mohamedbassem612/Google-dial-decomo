package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ijq {
    private static final aimz a = aimz.i("com/android/dialer/audioprism/internal/features/impl/AudioPrismRunningFeaturesImpl");
    private final java.util.Map b = new java.util.LinkedHashMap();
    private final apdp c = new apdp();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.ijn ijnVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.ijn) {
            ijnVar = (defpackage.ijn) aolnVar;
            int i = ijnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ijnVar.c = i - Integer.MIN_VALUE;
            } else {
                ijnVar = new defpackage.ijn(this, aolnVar);
            }
        } else {
            ijnVar = new defpackage.ijn(this, aolnVar);
        }
        java.lang.Object obj = ijnVar.a;
        java.util.Map mapAS = aolu.a;
        int i2 = ijnVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.c;
                ijnVar.d = apdpVar2;
                ijnVar.c = 1;
                if (apdpVar2.b(ijnVar) != mapAS) {
                    apdpVar = apdpVar2;
                }
                return mapAS;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = ijnVar.d;
            aooc.af(obj);
            mapAS = ajsz.aS(this.b);
            return mapAS;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object b(ifv ifvVar, igf igfVar, aoln aolnVar) {
        defpackage.ijo ijoVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.ijo) {
            ijoVar = (defpackage.ijo) aolnVar;
            int i = ijoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ijoVar.c = i - Integer.MIN_VALUE;
            } else {
                ijoVar = new defpackage.ijo(this, aolnVar);
            }
        } else {
            ijoVar = new defpackage.ijo(this, aolnVar);
        }
        java.lang.Object obj = ijoVar.a;
        aojh aojhVar = aolu.a;
        int i2 = ijoVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.c;
                ijoVar.d = ifvVar;
                ijoVar.e = igfVar;
                ijoVar.f = apdpVar;
                ijoVar.c = 1;
                if (apdpVar.b(ijoVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = ijoVar.f;
            igfVar = ijoVar.e;
            ifv ifvVar2 = ijoVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            ifvVar = ifvVar2;
            java.util.Map map = this.b;
            if (map.containsKey(ifvVar)) {
                a.d().l("com/android/dialer/audioprism/internal/features/impl/AudioPrismRunningFeaturesImpl", "started$<anonymous>", 31, "AudioPrismRunningFeaturesImpl.kt").y("feature already started: %s", ifvVar.name());
            } else {
                map.put(ifvVar, igfVar);
            }
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object c(ifv ifvVar, aoln aolnVar) {
        defpackage.ijp ijpVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.ijp) {
            ijpVar = (defpackage.ijp) aolnVar;
            int i = ijpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ijpVar.c = i - Integer.MIN_VALUE;
            } else {
                ijpVar = new defpackage.ijp(this, aolnVar);
            }
        } else {
            ijpVar = new defpackage.ijp(this, aolnVar);
        }
        java.lang.Object obj = ijpVar.a;
        aojh aojhVar = aolu.a;
        int i2 = ijpVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.c;
                ijpVar.d = ifvVar;
                ijpVar.e = apdpVar;
                ijpVar.c = 1;
                if (apdpVar.b(ijpVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = ijpVar.e;
            ifv ifvVar2 = ijpVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            ifvVar = ifvVar2;
            java.util.Map map = this.b;
            if (map.containsKey(ifvVar)) {
                map.remove(ifvVar);
            } else {
                a.d().l("com/android/dialer/audioprism/internal/features/impl/AudioPrismRunningFeaturesImpl", "stopped$<anonymous>", 41, "AudioPrismRunningFeaturesImpl.kt").y("feature has already stopped or not run: %s", ifvVar.name());
            }
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }
}
