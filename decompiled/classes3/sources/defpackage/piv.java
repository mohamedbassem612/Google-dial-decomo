package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class piv implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ piv(aihd aihdVar, defpackage.ptx ptxVar, boolean z, defpackage.ovb ovbVar, java.util.Set set, int i) {
        this.$cid = i;
        this.d = aihdVar;
        this.b = ptxVar;
        this.a = z;
        this.e = ovbVar;
        this.c = set;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        int i = this.$cid;
        if (i == 0) {
            boolean z = this.a;
            java.lang.Object obj = this.e;
            return (j$.util.Optional) ((mgu) this.b).b(new defpackage.piy((java.util.Set) this.c, (j$.util.Optional) this.d, (android.content.Context) obj, z, 0)).a(mfy.br);
        }
        if (i == 1) {
            ?? r1 = this.d;
            if (!((aihd) r1).isEmpty()) {
                defpackage.pad.a.b().l("com/android/dialer/incall/answer/service/AnswerProducerModule", "produceAnswerScreen", 67, "AnswerProducerModule.java").y("enforced by %s", j$.util.Collection.-EL.stream((java.util.Collection) r1).map(new old(11)).collect(j$.util.stream.Collectors.joining(",")));
                return j$.util.Optional.of(defpackage.pzp.ANSWER_SCREEN);
            }
            if (((defpackage.ptx) this.b).k()) {
                hgb.c(defpackage.pad.a.b(), "call has been disconnected during answering", "com/android/dialer/incall/answer/service/AnswerProducerModule", "produceAnswerScreen", 'Q', "AnswerProducerModule.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                return j$.util.Optional.of(defpackage.pzp.ANSWER_SCREEN);
            }
            if (!this.a) {
                return j$.util.Optional.empty();
            }
            if (((defpackage.ovb) this.e).b()) {
                hgb.c(defpackage.pad.a.b(), "skipping creating answer fragment because the call has been already answered", "com/android/dialer/incall/answer/service/AnswerProducerModule", "produceAnswerScreen", ']', "AnswerProducerModule.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                return j$.util.Optional.empty();
            }
            ?? r0 = this.c;
            if (r0.isEmpty()) {
                return j$.util.Optional.of(defpackage.pzp.ANSWER_SCREEN);
            }
            defpackage.pad.a.b().l("com/android/dialer/incall/answer/service/AnswerProducerModule", "produceAnswerScreen", 101, "AnswerProducerModule.java").y("inhibited by %s", j$.util.Collection.-EL.stream((java.util.Collection) r0).map(new old(12)).collect(j$.util.stream.Collectors.joining(",")));
            return j$.util.Optional.empty();
        }
        if (aiql.H((java.util.concurrent.Future) this.b) != defpackage.zpo.f) {
            defpackage.tzv.a.b().l("com/android/dialer/sonic/impl/service/SonicAudioPlayer", "playAudioForLocalOrRemoteInternal", 179, "SonicAudioPlayer.java").v("CallState is not active, not playing sonic audio");
            return null;
        }
        java.lang.Object obj2 = this.c;
        boolean z2 = this.a;
        ?? r5 = this.d;
        java.lang.Object obj3 = this.e;
        java.lang.String str = (java.lang.String) aiql.H((java.util.concurrent.Future) r5);
        if (z2) {
            defpackage.tzv tzvVar = (defpackage.tzv) obj3;
            hxv hxvVar = tzvVar.c;
            ahrv ahrvVarG = ahrv.g(aosv.F(hxvVar.c, 0, new huk(hxvVar, new hxx(new java.io.File(str)), (aoln) null, 4), 3));
            defpackage.tak takVar = new defpackage.tak(obj3, obj2, 9, null);
            ajct ajctVar = tzvVar.b;
            tzvVar.e.g(ahvr.H(ahrvVarG.i(takVar, ajctVar), new defpackage.tbp(16), ajctVar), 1L, java.util.concurrent.TimeUnit.MINUTES);
            return null;
        }
        defpackage.tzv tzvVar2 = (defpackage.tzv) obj3;
        hxv hxvVar2 = tzvVar2.c;
        ahrv ahrvVarG2 = ahrv.g(aosv.F(hxvVar2.c, 0, new huk(hxvVar2, new hxx(new java.io.File(str)), (aoln) null, 5, (byte[]) null), 3));
        defpackage.tak takVar2 = new defpackage.tak(obj3, obj2, 11, null);
        ajct ajctVar2 = tzvVar2.b;
        tzvVar2.e.g(ahvr.H(ahrvVarG2.i(takVar2, ajctVar2), new defpackage.tbp(18), ajctVar2), 1L, java.util.concurrent.TimeUnit.MINUTES);
        return null;
    }

    public /* synthetic */ piv(mgu mguVar, java.util.Set set, j$.util.Optional optional, android.content.Context context, boolean z, int i) {
        this.$cid = i;
        this.b = mguVar;
        this.c = set;
        this.d = optional;
        this.e = context;
        this.a = z;
    }

    public /* synthetic */ piv(defpackage.tzv tzvVar, ajcq ajcqVar, ajcq ajcqVar2, boolean z, j$.util.Optional optional, int i) {
        this.$cid = i;
        this.e = tzvVar;
        this.b = ajcqVar;
        this.d = ajcqVar2;
        this.a = z;
        this.c = optional;
    }
}
