package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rbu extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public rbu(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.rbu.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:47:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0111  */
    /* JADX WARN: Code duplicated, block: B:50:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0128  */
    /* JADX WARN: Code duplicated, block: B:52:0x0131  */
    /* JADX WARN: Code duplicated, block: B:56:0x0157  */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        int i;
        ajcq ajcqVarH;
        int i2;
        int i3;
        int i4;
        int iIntValue;
        java.util.List list = (java.util.List) obj;
        defpackage.rak rakVar = (defpackage.rak) list.get(0);
        ajct ajctVar = (ajct) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(3);
        if (optional.isEmpty()) {
            return aiql.z(j$.util.Optional.empty());
        }
        defpackage.qud qudVar = (defpackage.qud) optional.orElse((java.lang.Object) null);
        akzx akzxVarM = defpackage.quc.a.m();
        int iBX = pez.bX(qudVar.g);
        if (iBX == 0) {
            iBX = 1;
        }
        akzxVarM.u();
        defpackage.quc qucVar = (defpackage.quc) akzxVarM.b;
        qucVar.g = iBX - 1;
        qucVar.b |= 1;
        akzxVarM.u();
        defpackage.quc qucVar2 = (defpackage.quc) akzxVarM.b;
        qucVar2.b |= 2;
        qucVar2.h = zBooleanValue;
        ajcq ajcqVarH2 = ajcm.a;
        int i5 = qudVar.c;
        if (i5 == 0) {
            i = 3;
        } else if (i5 != 2) {
            i = i5 != 7 ? 0 : 2;
        } else {
            i = 1;
        }
        int i6 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i6 != 0) {
            if (i6 == 1) {
                ajcqVarH = ahvr.H(rakVar.a(i5 == 7 ? (java.lang.String) qudVar.d : ""), new defpackage.qgx(akzxVarM, 14), ajctVar);
            } else if (i6 == 2) {
                defpackage.rau.a.b().l("com/android/dialer/incall/voice/service/VoiceProducerModule", "produceVoiceAnimationConfig", 428, "VoiceProducerModule.java").v("no background animation source is set");
            }
            i2 = qudVar.e;
            if (i2 != 0) {
                i3 = 3;
            } else if (i2 != 3) {
                i3 = 1;
            } else if (i2 != 8) {
                i3 = 0;
            } else {
                i3 = 2;
            }
            i4 = i3 - 1;
            if (i3 != 0) {
                throw null;
            }
            if (i4 != 0) {
                if (i2 == 3) {
                    iIntValue = ((java.lang.Integer) qudVar.f).intValue();
                } else {
                    iIntValue = 0;
                }
                akzxVarM.u();
                defpackage.quc qucVar3 = (defpackage.quc) akzxVarM.b;
                qucVar3.e = 3;
                qucVar3.f = java.lang.Integer.valueOf(iIntValue);
            } else if (i4 != 1) {
                ajcqVarH2 = ahvr.H(rakVar.a(i2 == 8 ? (java.lang.String) qudVar.f : ""), new defpackage.qgx(akzxVarM, 15), ajctVar);
            } else if (i4 == 2) {
                defpackage.rau.a.b().l("com/android/dialer/incall/voice/service/VoiceProducerModule", "produceVoiceAnimationConfig", 446, "VoiceProducerModule.java").v("no foreground animation source is set");
            }
            return ahvr.ak(new ajcq[]{ajcqVarH, ajcqVarH2}).o(new raj(akzxVarM, 6), ajctVar);
        }
        int iIntValue2 = i5 == 2 ? ((java.lang.Integer) qudVar.d).intValue() : 0;
        akzxVarM.u();
        defpackage.quc qucVar4 = (defpackage.quc) akzxVarM.b;
        qucVar4.c = 2;
        qucVar4.d = java.lang.Integer.valueOf(iIntValue2);
        ajcqVarH = ajcqVarH2;
        i2 = qudVar.e;
        if (i2 != 0) {
            i3 = 3;
        } else if (i2 != 3) {
            i3 = 1;
        } else if (i2 != 8) {
            i3 = 0;
        } else {
            i3 = 2;
        }
        i4 = i3 - 1;
        if (i3 != 0) {
            throw null;
        }
        if (i4 != 0) {
            if (i2 == 3) {
                iIntValue = ((java.lang.Integer) qudVar.f).intValue();
            } else {
                iIntValue = 0;
            }
            akzxVarM.u();
            defpackage.quc qucVar5 = (defpackage.quc) akzxVarM.b;
            qucVar5.e = 3;
            qucVar5.f = java.lang.Integer.valueOf(iIntValue);
        } else if (i4 != 1) {
            ajcqVarH2 = ahvr.H(rakVar.a(i2 == 8 ? (java.lang.String) qudVar.f : ""), new defpackage.qgx(akzxVarM, 15), ajctVar);
        } else if (i4 == 2) {
            defpackage.rau.a.b().l("com/android/dialer/incall/voice/service/VoiceProducerModule", "produceVoiceAnimationConfig", 446, "VoiceProducerModule.java").v("no foreground animation source is set");
        }
        return ahvr.ak(new ajcq[]{ajcqVarH, ajcqVarH2}).o(new raj(akzxVarM, 6), ajctVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
