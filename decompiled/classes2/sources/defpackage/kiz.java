package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kiz implements ahtl {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ kiz(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final ahtm a(ahth ahthVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.ied iedVar = ((defpackage.ieh) ahthVar).a;
            int i2 = iedVar.e;
            defpackage.iec iecVarB = defpackage.iec.b(i2);
            if (iecVarB == null) {
                iecVarB = defpackage.iec.UNRECOGNIZED;
            }
            java.lang.Object obj = this.a;
            if (iecVarB == defpackage.iec.DOBBY_AUDIO_UNDER_CALL_LOG) {
                ((defpackage.kjd) obj).d(iedVar.f);
            } else {
                defpackage.iec iecVarB2 = defpackage.iec.b(i2);
                if (iecVarB2 == null) {
                    iecVarB2 = defpackage.iec.UNRECOGNIZED;
                }
                if (iecVarB2 != defpackage.iec.CALL_SCREEN_AUDIO_UNDER_CALL_LOG) {
                    defpackage.iec iecVarB3 = defpackage.iec.b(i2);
                    if (iecVarB3 == null) {
                        iecVarB3 = defpackage.iec.UNRECOGNIZED;
                    }
                    java.util.Objects.toString(iecVarB3);
                    throw new java.lang.IllegalStateException("Invalid audio source key ".concat(iecVarB3.toString()));
                }
                java.lang.String str = iedVar.g;
                if (str == null || str.length() == 0) {
                    throw new java.lang.IllegalStateException("Missing call mapping id");
                }
                java.lang.String str2 = iedVar.g;
                aooh.e(str2, "getCallMappingId(...)");
                ((defpackage.kjd) obj).c(str2);
            }
            return ahtm.a;
        }
        if (i == 1) {
            defpackage.ied iedVar2 = ((defpackage.ieh) ahthVar).a;
            defpackage.isr isrVar = (defpackage.isr) this.a;
            if (isrVar.e.b()) {
                aoov.an(isrVar.f, (aolr) null, 0, new defpackage.iiw(isrVar, iedVar2, (aoln) null, 12), 3);
            } else {
                int i3 = iedVar2.e;
                defpackage.iec iecVarB4 = defpackage.iec.b(i3);
                if (iecVarB4 == null) {
                    iecVarB4 = defpackage.iec.UNRECOGNIZED;
                }
                if (iecVarB4 != defpackage.iec.DOBBY_AUDIO_UNDER_CALL_LOG) {
                    defpackage.iec iecVarB5 = defpackage.iec.b(i3);
                    if (iecVarB5 == null) {
                        iecVarB5 = defpackage.iec.UNRECOGNIZED;
                    }
                    java.util.Objects.toString(iecVarB5);
                    throw new java.lang.IllegalStateException("Invalid audio source key ".concat(iecVarB5.toString()));
                }
                aoov.an(isrVar.f, (aolr) null, 0, new defpackage.iiw(isrVar, iedVar2, (aoln) null, 13, (byte[]) null), 3);
            }
            return ahtm.a;
        }
        if (i != 2) {
            defpackage.ied iedVar3 = ((defpackage.ieh) ahthVar).a;
            java.lang.String path = android.net.Uri.parse(iedVar3.c).getPath();
            long j = iedVar3.f;
            if (path != null) {
                defpackage.hhb.p(path, j).r(((aw) ((defpackage.kvp) this.a).a).I(), "DeleteCallRecordingDialogFragment");
            }
            return ahtm.a;
        }
        defpackage.jym jymVar = (defpackage.jym) ahthVar;
        aooh.c(jymVar);
        java.lang.Object obj2 = this.a;
        try {
            kiu kiuVar = jymVar.a;
            defpackage.jyh jyhVar = jymVar.b;
            ((defpackage.kma) obj2).K.W(jyhVar.b, new defpackage.jyg(kiuVar, jyhVar.a, ((defpackage.kma) obj2).x));
        } catch (java.lang.RuntimeException e) {
            defpackage.kma.s.d().k(e).g(1, java.util.concurrent.TimeUnit.MINUTES).i(zct.b).l("com/android/dialer/calllog/ui/ConversationHistoryViewHolder", "chipOnClickMultibinding", 249, "ConversationHistoryViewHolder.kt").v("exception thrown when handling click on a chip");
        }
        return ahtm.a;
    }
}
