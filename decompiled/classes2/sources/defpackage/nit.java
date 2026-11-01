package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class nit extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    int f;
    final /* synthetic */ defpackage.njd g;
    private /* synthetic */ java.lang.Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nit(defpackage.njd njdVar, aoln aolnVar) {
        super(2, aolnVar);
        this.g = njdVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00cb A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:12:0x0035, B:27:0x00bc, B:29:0x00cb, B:31:0x00e7, B:49:0x018e, B:50:0x0195), top: B:57:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00e7 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #1 {all -> 0x003a, blocks: (B:12:0x0035, B:27:0x00bc, B:29:0x00cb, B:31:0x00e7, B:49:0x018e, B:50:0x0195), top: B:57:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x010e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0135 A[Catch: all -> 0x018c, TRY_LEAVE, TryCatch #2 {all -> 0x018c, blocks: (B:9:0x0028, B:34:0x0118, B:36:0x0135, B:40:0x014b), top: B:58:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0146  */
    /* JADX WARN: Code duplicated, block: B:39:0x014a  */
    /* JADX WARN: Code duplicated, block: B:43:0x016c  */
    /* JADX WARN: Code duplicated, block: B:49:0x018e A[Catch: all -> 0x003a, TRY_ENTER, TryCatch #1 {all -> 0x003a, blocks: (B:12:0x0035, B:27:0x00bc, B:29:0x00cb, B:31:0x00e7, B:49:0x018e, B:50:0x0195), top: B:57:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        aoss aossVar;
        defpackage.njd njdVar;
        apdp apdpVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        aoss aossVar2;
        java.lang.Object obj6;
        java.lang.Object obj7;
        aimz aimzVar;
        java.lang.Object obj8;
        aimw aimwVarL;
        java.lang.Object objA;
        java.lang.Object obj9;
        aoss aossVar3;
        java.lang.Object obj10;
        aimw aimwVar;
        java.lang.Object obj11;
        java.lang.Object obj12;
        java.lang.Object obj13;
        boolean zBooleanValue;
        aosy aosyVar;
        aolu aoluVar = aolu.a;
        int i = this.f;
        try {
            if (i == 0) {
                aooc.af(obj);
                aossVar = (aoss) this.h;
                njdVar = this.g;
                this.h = aossVar;
                apdpVar = njdVar.q;
                this.a = apdpVar;
                this.b = njdVar;
                this.f = 1;
                if (apdpVar.b(this) == aoluVar) {
                    obj3 = njdVar;
                    obj2 = apdpVar;
                    return aoluVar;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            aooc.af(obj);
                        } else {
                            java.lang.Object obj14 = this.e;
                            obj12 = this.d;
                            obj9 = this.c;
                            java.lang.Object obj15 = this.b;
                            obj4 = this.a;
                            aossVar3 = (aoss) this.h;
                            try {
                                aooc.af(obj);
                                aimwVar = obj14;
                                obj10 = obj15;
                                obj11 = obj4;
                                aimwVar.y((java.lang.String) obj12, new aepg((aenj) obj));
                                if (((java.lang.Boolean) ((defpackage.njd) obj10).k.a()).booleanValue()) {
                                    ((defpackage.njd) obj10).p.a(qbc.ba);
                                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                                    ((apdp) obj11).d();
                                    return bool;
                                }
                                obj7 = obj9;
                                obj13 = obj10;
                                aossVar2 = aossVar3;
                                obj8 = obj11;
                                defpackage.nea neaVar = new defpackage.nea((defpackage.njd) obj13, (java.io.File) obj7, (aoln) null, 11);
                                zBooleanValue = false;
                                ((defpackage.njd) obj13).m = aoov.am(aossVar2, 0, neaVar, 3);
                                ((apdp) obj8).d();
                                aosyVar = this.g.m;
                                if (aosyVar != null) {
                                    this.h = null;
                                    this.a = null;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.e = null;
                                    this.f = 4;
                                    obj = aosyVar.a(this);
                                    if (obj == aoluVar) {
                                        return aoluVar;
                                    }
                                }
                                return java.lang.Boolean.valueOf(zBooleanValue);
                            } catch (java.lang.Throwable th) {
                                th = th;
                            }
                        }
                        zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                        return java.lang.Boolean.valueOf(zBooleanValue);
                    }
                    java.lang.Object obj16 = this.b;
                    java.lang.Object obj17 = this.a;
                    aossVar2 = (aoss) this.h;
                    try {
                        aooc.af(obj);
                        obj6 = obj16;
                        obj5 = obj17;
                        aooh.e(obj, "await(...)");
                        obj7 = (java.io.File) aooh.q((j$.util.Optional) obj);
                        if (obj7 != null) {
                            throw new java.lang.IllegalStateException("Dial tone sound file is not available.");
                        }
                        aimzVar = defpackage.njd.a;
                        aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "playDialToneAndAwait$<anonymous>$<anonymous>", 634, "DobbyUplinkAudioInjector.kt").v("start playing dial tone");
                        if (((defpackage.njd) obj6).o()) {
                            obj8 = obj5;
                            obj13 = obj6;
                        } else {
                            aimwVarL = aimzVar.d().l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "playDialToneAndAwait$<anonymous>$<anonymous>", 638, "DobbyUplinkAudioInjector.kt");
                            defpackage.mqt mqtVar = ((defpackage.njd) obj6).f;
                            this.h = aossVar2;
                            this.a = obj5;
                            this.b = obj6;
                            this.c = obj7;
                            this.d = "NGCS audio playing is not under allowed states, events: %s";
                            this.e = aimwVarL;
                            this.f = 3;
                            objA = mqtVar.a(this);
                            if (objA != aoluVar) {
                                return aoluVar;
                            }
                            aoss aossVar4 = aossVar2;
                            obj9 = obj7;
                            obj = objA;
                            aossVar3 = aossVar4;
                            obj10 = obj6;
                            aimwVar = aimwVarL;
                            obj11 = obj5;
                            obj12 = "NGCS audio playing is not under allowed states, events: %s";
                            aimwVar.y((java.lang.String) obj12, new aepg((aenj) obj));
                            if (((java.lang.Boolean) ((defpackage.njd) obj10).k.a()).booleanValue()) {
                                ((defpackage.njd) obj10).p.a(qbc.ba);
                                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                                ((apdp) obj11).d();
                                return bool2;
                            }
                            obj7 = obj9;
                            obj13 = obj10;
                            aossVar2 = aossVar3;
                            obj8 = obj11;
                        }
                        defpackage.nea neaVar2 = new defpackage.nea((defpackage.njd) obj13, (java.io.File) obj7, (aoln) null, 11);
                        zBooleanValue = false;
                        ((defpackage.njd) obj13).m = aoov.am(aossVar2, 0, neaVar2, 3);
                        ((apdp) obj8).d();
                        aosyVar = this.g.m;
                        if (aosyVar != null) {
                            this.h = null;
                            this.a = null;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.f = 4;
                            obj = aosyVar.a(this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                        }
                        return java.lang.Boolean.valueOf(zBooleanValue);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        obj4 = obj17;
                    }
                    ((apdp) obj4).d();
                    throw th;
                }
                java.lang.Object obj18 = this.b;
                java.lang.Object obj19 = this.a;
                aossVar = (aoss) this.h;
                aooc.af(obj);
                obj2 = obj19;
                obj3 = obj18;
            }
            obj3 = njdVar;
            obj2 = apdpVar;
            if (((defpackage.njd) obj3).p()) {
                defpackage.njd.a.b().l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "playDialToneAndAwait$<anonymous>$<anonymous>", 622, "DobbyUplinkAudioInjector.kt").v("already playing - playDialToneAndAwait");
                java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
                ((apdp) obj2).d();
                return bool3;
            }
            defpackage.njd.a.b().l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "playDialToneAndAwait$<anonymous>$<anonymous>", 626, "DobbyUplinkAudioInjector.kt").v("start creating dial tone audio file");
            ajcq ajcqVarA = ((defpackage.njd) obj3).d.a(2131951677, "dial_tone.ogg");
            this.h = aossVar;
            this.a = obj2;
            this.b = obj3;
            this.f = 2;
            java.lang.Object objD = aosv.D(ajcqVarA, this);
            if (objD == aoluVar) {
                return aoluVar;
            }
            obj5 = obj2;
            obj = objD;
            aossVar2 = aossVar;
            obj6 = obj3;
            aooh.e(obj, "await(...)");
            obj7 = (java.io.File) aooh.q((j$.util.Optional) obj);
            if (obj7 != null) {
                throw new java.lang.IllegalStateException("Dial tone sound file is not available.");
            }
            aimzVar = defpackage.njd.a;
            aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "playDialToneAndAwait$<anonymous>$<anonymous>", 634, "DobbyUplinkAudioInjector.kt").v("start playing dial tone");
            if (((defpackage.njd) obj6).o()) {
                aimwVarL = aimzVar.d().l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "playDialToneAndAwait$<anonymous>$<anonymous>", 638, "DobbyUplinkAudioInjector.kt");
                defpackage.mqt mqtVar2 = ((defpackage.njd) obj6).f;
                this.h = aossVar2;
                this.a = obj5;
                this.b = obj6;
                this.c = obj7;
                this.d = "NGCS audio playing is not under allowed states, events: %s";
                this.e = aimwVarL;
                this.f = 3;
                objA = mqtVar2.a(this);
                if (objA != aoluVar) {
                    return aoluVar;
                }
                aoss aossVar5 = aossVar2;
                obj9 = obj7;
                obj = objA;
                aossVar3 = aossVar5;
                obj10 = obj6;
                aimwVar = aimwVarL;
                obj11 = obj5;
                obj12 = "NGCS audio playing is not under allowed states, events: %s";
                aimwVar.y((java.lang.String) obj12, new aepg((aenj) obj));
                if (((java.lang.Boolean) ((defpackage.njd) obj10).k.a()).booleanValue()) {
                    ((defpackage.njd) obj10).p.a(qbc.ba);
                    java.lang.Boolean bool4 = java.lang.Boolean.FALSE;
                    ((apdp) obj11).d();
                    return bool4;
                }
                obj7 = obj9;
                obj13 = obj10;
                aossVar2 = aossVar3;
                obj8 = obj11;
            } else {
                obj8 = obj5;
                obj13 = obj6;
            }
            defpackage.nea neaVar3 = new defpackage.nea((defpackage.njd) obj13, (java.io.File) obj7, (aoln) null, 11);
            zBooleanValue = false;
            ((defpackage.njd) obj13).m = aoov.am(aossVar2, 0, neaVar3, 3);
            ((apdp) obj8).d();
            aosyVar = this.g.m;
            if (aosyVar != null) {
                this.h = null;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = 4;
                obj = aosyVar.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
            }
            return java.lang.Boolean.valueOf(zBooleanValue);
        } catch (java.lang.Throwable th3) {
            th = th3;
            obj4 = obj2;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.nit nitVar = new defpackage.nit(this.g, aolnVar);
        nitVar.h = obj;
        return nitVar;
    }
}
