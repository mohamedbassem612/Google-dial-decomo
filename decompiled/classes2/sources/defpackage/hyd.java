package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class hyd implements dsf {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ hyd(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final java.lang.Object a(dsd dsdVar) {
        switch (this.$cid) {
            case 0:
                ((defpackage.hyf) this.a).a = dsdVar;
                break;
            case 1:
                ((defpackage.hxj) this.a).c = dsdVar;
                return "startAudioCompleter";
            case 2:
                java.lang.Object obj = this.a;
                ((defpackage.ibd) obj).c.eT(ahqx.h(new defpackage.gra(obj, dsdVar, 19)));
                return "CallAudioManagerImpl.getNextActiveCallAudio";
            case 3:
                ((defpackage.ibk) this.a).h = j$.util.Optional.of(dsdVar);
                break;
            case 4:
                java.lang.Object obj2 = this.a;
                pmw pmwVar = new pmw(obj2, dsdVar, 3);
                pqm pqmVar = (pqm) obj2;
                ahvr.J(ahvr.E(pmwVar, pqmVar.c), new defpackage.kxp(pqmVar, dsdVar, 5), pqmVar.d);
                return "Disconnect";
            case 5:
                java.lang.Object obj3 = this.a;
                pmw pmwVar2 = new pmw(obj3, dsdVar, 2);
                pqm pqmVar2 = (pqm) obj3;
                ahvr.J(ahvr.E(pmwVar2, pqmVar2.c), new defpackage.kxp(pqmVar2, dsdVar, 6, (byte[]) null), pqmVar2.d);
                return "Unhold";
            case 6:
                ((pqo) this.a).c = dsdVar;
                return "CallDirection";
            case 7:
                ((whl) this.a).b = dsdVar;
                return "sessionTrackingFuture";
            case 8:
                ((wyt) this.a).b = dsdVar;
                return "sessionTrackingFuture";
            default:
                ((aaum) this.a).n(ajbm.a, new agew(ahqz.b(), new ahsk(dsdVar, 0), 2));
                return "Task initializer";
        }
        return "playbackEndedCompleter";
    }
}
