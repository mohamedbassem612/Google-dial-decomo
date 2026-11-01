package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tmm extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    boolean b;
    java.lang.Object c;
    int d;
    final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmm(lrh lrhVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = lrhVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        int streamVolume;
        boolean zBooleanValue;
        java.lang.Object obj3;
        java.lang.Object objA;
        boolean z;
        java.lang.Object obj4;
        int i;
        boolean z2;
        int i2;
        lsc lscVar;
        java.lang.Object obj5;
        int i3;
        boolean zBooleanValue2;
        java.lang.Object obj6;
        java.lang.Object objA2;
        boolean z3;
        java.lang.Object obj7;
        int i4;
        boolean z4;
        int i5;
        if (this.$cid != 0) {
            aolu aoluVar = aolu.a;
            int i6 = this.d;
            if (i6 == 0) {
                aooc.af(obj);
                java.lang.Object obj8 = this.e;
                lrh lrhVar = (lrh) obj8;
                if (((java.lang.Boolean) lrhVar.e.a()).booleanValue()) {
                    lrh.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerAudioHapticsPlayer", "playAudio$<anonymous>", 71, "ContactCheckerAudioHapticsPlayer.kt").v("Do not play spoof alert audio on new spoof alert, only play haptics");
                    return lsb.a;
                }
                if (!((java.lang.Boolean) lrhVar.g.a()).booleanValue()) {
                    this.c = obj8;
                    this.d = 4;
                    java.lang.Object objA3 = lrhVar.a(2131951675, "contact_checker_spoof_alert_sound_v1.wav", this);
                    if (objA3 == aoluVar) {
                        return aoluVar;
                    }
                    obj5 = obj8;
                    obj = objA3;
                    this.c = null;
                    this.d = 5;
                    aimz aimzVar = lrh.a;
                    obj = ((lrh) obj5).b((java.io.File) obj, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    return (lsc) obj;
                }
                int streamVolume2 = lrhVar.f.getStreamVolume(0);
                this.a = streamVolume2;
                this.d = 1;
                java.lang.Object objAj = aoov.aj(lrhVar.b, new bck(lrhVar, streamVolume2, (aoln) null, 5), this);
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                i3 = streamVolume2;
                obj = objAj;
                zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                obj6 = this.e;
                this.c = obj6;
                this.a = i3;
                this.b = zBooleanValue2;
                this.d = 2;
                objA2 = ((lrh) obj6).a(2131951675, "contact_checker_spoof_alert_sound_v1.wav", this);
                if (objA2 != aoluVar) {
                    return aoluVar;
                }
                int i7 = i3;
                z3 = zBooleanValue2;
                obj = objA2;
                obj7 = obj6;
                i4 = i7;
                this.c = null;
                this.a = i4;
                this.b = z3;
                this.d = 3;
                aimz aimzVar2 = lrh.a;
                obj = ((lrh) obj7).b((java.io.File) obj, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                z4 = z3;
                i5 = i4;
            } else if (i6 == 1) {
                i3 = this.a;
                aooc.af(obj);
                zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                obj6 = this.e;
                this.c = obj6;
                this.a = i3;
                this.b = zBooleanValue2;
                this.d = 2;
                objA2 = ((lrh) obj6).a(2131951675, "contact_checker_spoof_alert_sound_v1.wav", this);
                if (objA2 != aoluVar) {
                    return aoluVar;
                }
                int i8 = i3;
                z3 = zBooleanValue2;
                obj = objA2;
                obj7 = obj6;
                i4 = i8;
                this.c = null;
                this.a = i4;
                this.b = z3;
                this.d = 3;
                aimz aimzVar3 = lrh.a;
                obj = ((lrh) obj7).b((java.io.File) obj, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                z4 = z3;
                i5 = i4;
            } else if (i6 == 2) {
                z3 = this.b;
                i4 = this.a;
                obj7 = this.c;
                aooc.af(obj);
                this.c = null;
                this.a = i4;
                this.b = z3;
                this.d = 3;
                aimz aimzVar4 = lrh.a;
                obj = ((lrh) obj7).b((java.io.File) obj, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                z4 = z3;
                i5 = i4;
            } else {
                if (i6 != 3) {
                    if (i6 != 4) {
                        aooc.af(obj);
                    } else {
                        obj5 = this.c;
                        aooc.af(obj);
                        this.c = null;
                        this.d = 5;
                        aimz aimzVar5 = lrh.a;
                        obj = ((lrh) obj5).b((java.io.File) obj, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                    }
                    return (lsc) obj;
                }
                z4 = this.b;
                i5 = this.a;
                aooc.af(obj);
            }
            lscVar = (lsc) obj;
            if (z4) {
                ((lrh) this.e).f.setStreamVolume(0, i5, 0);
            }
        } else {
            aolu aoluVar2 = aolu.a;
            int i9 = this.d;
            if (i9 == 0) {
                aooc.af(obj);
                java.lang.Object obj9 = this.e;
                defpackage.tms tmsVar = (defpackage.tms) obj9;
                if (((java.lang.Boolean) tmsVar.e.a()).booleanValue()) {
                    defpackage.tms.a.b().l("com/android/dialer/sharpie/impl/service/SharpieAudioHapticsPlayer", "play$<anonymous>$<anonymous>", 76, "SharpieAudioHapticsPlayer.kt").v("Do not play scam alert audio on new scam alert, only play haptics");
                    return defpackage.tpa.a;
                }
                if (!((java.lang.Boolean) tmsVar.g.a()).booleanValue()) {
                    this.c = obj9;
                    this.d = 4;
                    java.lang.Object objA4 = tmsVar.a(2131951706, "sharpie_alert_sound_v1.wav", this);
                    if (objA4 == aoluVar2) {
                        return aoluVar2;
                    }
                    obj2 = obj9;
                    obj = objA4;
                    this.c = null;
                    this.d = 5;
                    aimz aimzVar6 = defpackage.tms.a;
                    obj = ((defpackage.tms) obj2).b((java.io.File) obj, this);
                    if (obj == aoluVar2) {
                        return aoluVar2;
                    }
                    return (defpackage.tpb) obj;
                }
                streamVolume = tmsVar.f.getStreamVolume(0);
                this.a = streamVolume;
                this.d = 1;
                obj = aoov.aj(tmsVar.b, new defpackage.tmk(tmsVar, streamVolume, (aoln) null, 0), this);
                if (obj == aoluVar2) {
                    return aoluVar2;
                }
                zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                obj3 = this.e;
                this.c = obj3;
                this.a = streamVolume;
                this.b = zBooleanValue;
                this.d = 2;
                objA = ((defpackage.tms) obj3).a(2131951706, "sharpie_alert_sound_v1.wav", this);
                if (objA != aoluVar2) {
                    return aoluVar2;
                }
                int i10 = streamVolume;
                z = zBooleanValue;
                obj = objA;
                obj4 = obj3;
                i = i10;
                this.c = null;
                this.a = i;
                this.b = z;
                this.d = 3;
                aimz aimzVar7 = defpackage.tms.a;
                obj = ((defpackage.tms) obj4).b((java.io.File) obj, this);
                if (obj == aoluVar2) {
                    return aoluVar2;
                }
                z2 = z;
                i2 = i;
            } else if (i9 == 1) {
                streamVolume = this.a;
                aooc.af(obj);
                zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                obj3 = this.e;
                this.c = obj3;
                this.a = streamVolume;
                this.b = zBooleanValue;
                this.d = 2;
                objA = ((defpackage.tms) obj3).a(2131951706, "sharpie_alert_sound_v1.wav", this);
                if (objA != aoluVar2) {
                    return aoluVar2;
                }
                int i11 = streamVolume;
                z = zBooleanValue;
                obj = objA;
                obj4 = obj3;
                i = i11;
                this.c = null;
                this.a = i;
                this.b = z;
                this.d = 3;
                aimz aimzVar8 = defpackage.tms.a;
                obj = ((defpackage.tms) obj4).b((java.io.File) obj, this);
                if (obj == aoluVar2) {
                    return aoluVar2;
                }
                z2 = z;
                i2 = i;
            } else if (i9 == 2) {
                z = this.b;
                i = this.a;
                obj4 = this.c;
                aooc.af(obj);
                this.c = null;
                this.a = i;
                this.b = z;
                this.d = 3;
                aimz aimzVar9 = defpackage.tms.a;
                obj = ((defpackage.tms) obj4).b((java.io.File) obj, this);
                if (obj == aoluVar2) {
                    return aoluVar2;
                }
                z2 = z;
                i2 = i;
            } else {
                if (i9 != 3) {
                    if (i9 != 4) {
                        aooc.af(obj);
                    } else {
                        obj2 = this.c;
                        aooc.af(obj);
                        this.c = null;
                        this.d = 5;
                        aimz aimzVar10 = defpackage.tms.a;
                        obj = ((defpackage.tms) obj2).b((java.io.File) obj, this);
                        if (obj == aoluVar2) {
                            return aoluVar2;
                        }
                    }
                    return (defpackage.tpb) obj;
                }
                z2 = this.b;
                i2 = this.a;
                aooc.af(obj);
            }
            lscVar = (defpackage.tpb) obj;
            if (z2) {
                ((defpackage.tms) this.e).f.setStreamVolume(0, i2, 0);
            }
        }
        return lscVar;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        java.lang.Object obj2 = this.e;
        return i != 0 ? new defpackage.tmm((lrh) obj2, aolnVar, 1) : new defpackage.tmm((defpackage.tms) obj2, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmm(defpackage.tms tmsVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = tmsVar;
    }
}
