package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kja implements defpackage.ieg {
    private final /* synthetic */ int $cid;
    final /* synthetic */ defpackage.ied a;
    final /* synthetic */ java.lang.Object b;

    public kja(defpackage.ied iedVar, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = iedVar;
        this.b = obj;
    }

    @Override // defpackage.ieg
    public final void a(boolean z) {
        if (this.$cid != 0) {
            if (z) {
                defpackage.ied iedVar = this.a;
                int i = iedVar.e;
                defpackage.iec iecVarB = defpackage.iec.b(i);
                if (iecVarB == null) {
                    iecVarB = defpackage.iec.UNRECOGNIZED;
                }
                if (iecVarB != defpackage.iec.DOBBY_AUDIO_UNDER_CALL_LOG) {
                    defpackage.iec iecVarB2 = defpackage.iec.b(i);
                    if (iecVarB2 == null) {
                        iecVarB2 = defpackage.iec.UNRECOGNIZED;
                    }
                    if (iecVarB2 != defpackage.iec.BEESLY_AUDIO_UNDER_CALL_LOG) {
                        aimw aimwVarL = defpackage.isr.a.d().l("com/android/dialer/beesly/impl/calllogdropdownmenu/BeeslyCallLogViewBinder$setupAudioPlayerView$<anonymous>", "onPlayPauseButtonClicked", 416, "BeeslyCallLogViewBinder.kt");
                        defpackage.iec iecVarB3 = defpackage.iec.b(iedVar.e);
                        if (iecVarB3 == null) {
                            iecVarB3 = defpackage.iec.UNRECOGNIZED;
                        }
                        aimwVarL.y("BeeslyCallLogViewBinder unexpected AudioSourceKey: %s", new aepg(iecVarB3));
                        return;
                    }
                }
                java.lang.Object obj = this.b;
                ((defpackage.isr) obj).d.o(rmx.xz);
                return;
            }
            return;
        }
        if (z) {
            defpackage.ied iedVar2 = this.a;
            defpackage.iec iecVarB4 = defpackage.iec.b(iedVar2.e);
            if (iecVarB4 == null) {
                iecVarB4 = defpackage.iec.UNRECOGNIZED;
            }
            int iOrdinal = iecVarB4.ordinal();
            if (iOrdinal == 4) {
                java.lang.Object obj2 = this.b;
                ((defpackage.kjd) obj2).b.n(rmw.jX);
            } else if (iOrdinal == 5) {
                java.lang.Object obj3 = this.b;
                ((defpackage.kjd) obj3).b.o(rmx.kr);
            } else {
                aimw aimwVarL2 = defpackage.kjd.a.d().l("com/android/dialer/calllog/multibindingintegration/callscreentranscript/CallScreenTranscriptViewBinder$bindAudioPlayerViewData$<anonymous>", "onPlayPauseButtonClicked", 289, "CallScreenTranscriptViewBinder.kt");
                defpackage.iec iecVarB5 = defpackage.iec.b(iedVar2.e);
                if (iecVarB5 == null) {
                    iecVarB5 = defpackage.iec.UNRECOGNIZED;
                }
                aimwVarL2.y("CallScreenTranscripViewBinder unexpected AudioSourceKey: %s", new aepg(iecVarB5));
            }
        }
    }

    @Override // defpackage.ieg
    public final /* synthetic */ void b(defpackage.erb erbVar) {
        if (this.$cid != 0) {
            aooh.f(erbVar, "error");
        } else {
            aooh.f(erbVar, "error");
        }
    }

    @Override // defpackage.ieg
    public final /* synthetic */ void c() {
    }
}
