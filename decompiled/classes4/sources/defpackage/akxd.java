package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class akxd implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ akxd(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = 1;
        switch (this.$cid) {
            case 0:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                defpackage.akxz akxzVar = (defpackage.akxz) akzxVar.b;
                defpackage.akxz akxzVar2 = defpackage.akxz.a;
                akxzVar.b |= 2;
                akxzVar.d = iIntValue;
                break;
            case 1:
                ((android.view.ViewGroup.MarginLayoutParams) this.a).setMarginStart(((java.lang.Integer) obj).intValue());
                break;
            case 2:
                ((aprf) obj).c((defpackage.amaz) this.a);
                break;
            case 3:
                ((aprf) obj).b((defpackage.amax) this.a);
                break;
            case 4:
                ((aprf) obj).d((defpackage.aljk) this.a);
                break;
            case 5:
                ((defpackage.alje) this.a).d((java.io.InputStream) obj);
                break;
            case 6:
                ((aprf) obj).d((defpackage.aljk) this.a);
                break;
            case 7:
                java.util.List list = (java.util.List) obj;
                akzz akzzVarM = defpackage.almz.a.m();
                defpackage.alnb alnbVar = defpackage.alnb.EVENT_AUDIO_EMBEDDING;
                akzzVarM.u();
                defpackage.almz almzVar = akzzVarM.b;
                almzVar.c = alnbVar.aN;
                almzVar.b |= 1;
                apdi apdiVar = defpackage.alme.d;
                akzx akzxVarM = defpackage.alme.a.m();
                akzx akzxVarM2 = defpackage.almd.a.m();
                akzxVarM2.u();
                defpackage.almd almdVar = (defpackage.almd) akzxVarM2.b;
                alaj alajVar = almdVar.b;
                if (!alajVar.c()) {
                    almdVar.b = alad.G(alajVar);
                }
                java.lang.Object obj2 = this.a;
                akyl.i(list, almdVar.b);
                akzxVarM.u();
                defpackage.alme almeVar = (defpackage.alme) akzxVarM.b;
                defpackage.almd almdVar2 = (defpackage.almd) akzxVarM2.p();
                j$.util.Objects.requireNonNull(almdVar2);
                almeVar.c = almdVar2;
                almeVar.b |= 1;
                akzzVarM.bV(apdiVar, (defpackage.alme) akzxVarM.p());
                ((defpackage.aljm) obj2).c.b(akzzVarM.p());
                break;
            default:
                aljc aljcVar = (aljc) obj;
                j$.util.Optional optional = ((aljo) this.a).d;
                j$.util.Objects.requireNonNull(aljcVar);
                defpackage.alju aljuVar = new defpackage.alju(aljcVar, i);
                if (true == optional.isPresent()) {
                    java.io.OutputStream outputStream = (java.io.OutputStream) ((aljc) aljuVar.a).c.remove(optional.get());
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (java.io.IOException e) {
                            a.by(aljc.a.b(), "Failed to close output stream.", "com/google/quality/views/extraction/kcube/bg/ondevice/core/impl/AudioMulticaster", "closeInputStream", 'e', "AudioMulticaster.java", e);
                            return;
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
