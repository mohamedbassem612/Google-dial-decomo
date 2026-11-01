package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class waa extends aomh implements aonj {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ wad f;
    final /* synthetic */ android.telecom.CallAudioState g;
    final /* synthetic */ android.telecom.CallAudioState h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public waa(wad wadVar, android.telecom.CallAudioState callAudioState, android.telecom.CallAudioState callAudioState2, aoln aolnVar) {
        super(1, aolnVar);
        this.f = wadVar;
        this.g = callAudioState;
        this.h = callAudioState2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.waa(this.f, this.g, this.h, (aoln) obj).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a0 A[Catch: all -> 0x00da, TryCatch #3 {all -> 0x00da, blocks: (B:29:0x0098, B:31:0x00a0, B:33:0x00b9), top: B:55:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Throwable th;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        java.lang.Object obj9;
        aolu aoluVar = aolu.a;
        int i = this.e;
        try {
            if (i == 0) {
                aooc.af(obj);
                wad wadVar = this.f;
                obj2 = this.g;
                android.telecom.CallAudioState callAudioState = this.h;
                apdp apdpVar = wadVar.f;
                this.a = apdpVar;
                this.b = wadVar;
                this.c = obj2;
                this.d = callAudioState;
                this.e = 1;
                if (apdpVar.b(this) == aoluVar) {
                    return aoluVar;
                }
                obj3 = wadVar;
                obj4 = callAudioState;
                obj5 = apdpVar;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        obj6 = this.a;
                        try {
                            aooc.af(obj);
                            obj7 = obj6;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            ((apdp) obj6).d();
                            throw th;
                        }
                    } else {
                        obj3 = this.b;
                        obj9 = this.a;
                        try {
                            aooc.af(obj);
                            obj9 = obj9;
                            try {
                                obj8 = obj9;
                                if (((java.lang.Boolean) obj).booleanValue()) {
                                    wad.a.b().l("com/android/dialer/wear/audiotransfer/wearaudiotransferlistener/WearAudioTransferListener", "onAudioStateChanged$<anonymous>$<anonymous>", 75, "WearAudioTransferListener.kt").v("In-call audio transferred to Wear, but skipping UI minimization because an emergency call is active.");
                                    obj9 = obj9;
                                } else {
                                    ((wad) obj3).a().b(mce.gS);
                                    this.a = obj8;
                                    this.b = null;
                                    this.c = null;
                                    this.d = null;
                                    this.e = 3;
                                    obj9 = obj8;
                                    if (((wad) obj3).d(this) == aoluVar) {
                                        return aoluVar;
                                    }
                                }
                                obj7 = obj9;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                obj6 = obj9;
                                ((apdp) obj6).d();
                                throw th;
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            obj6 = obj9;
                            ((apdp) obj6).d();
                            throw th;
                        }
                    }
                    ((apdp) obj7).d();
                    return aojh.a;
                }
                java.lang.Object obj10 = this.d;
                obj2 = this.c;
                java.lang.Object obj11 = this.b;
                java.lang.Object obj12 = this.a;
                aooc.af(obj);
                obj4 = obj10;
                obj3 = obj11;
                obj5 = obj12;
            }
            ((wad) obj3).d = (android.telecom.CallAudioState) obj2;
            if (((wad) obj3).g((android.telecom.CallAudioState) obj4) || !((wad) obj3).g((android.telecom.CallAudioState) obj2)) {
                if (((wad) obj3).g((android.telecom.CallAudioState) obj4) && ((android.telecom.CallAudioState) obj2).getRoute() == 1) {
                    ((wad) obj3).a().b(mce.gU);
                }
                obj7 = obj5;
            } else {
                if (((java.lang.Boolean) ((wad) obj3).c.a()).booleanValue()) {
                    this.a = obj5;
                    this.b = obj3;
                    this.c = null;
                    this.d = null;
                    this.e = 2;
                    obj = ((wad) obj3).b(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    obj9 = obj5;
                    obj8 = obj9;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        wad.a.b().l("com/android/dialer/wear/audiotransfer/wearaudiotransferlistener/WearAudioTransferListener", "onAudioStateChanged$<anonymous>$<anonymous>", 75, "WearAudioTransferListener.kt").v("In-call audio transferred to Wear, but skipping UI minimization because an emergency call is active.");
                        obj9 = obj9;
                    }
                    obj7 = obj9;
                } else {
                    obj8 = obj5;
                }
                ((wad) obj3).a().b(mce.gS);
                this.a = obj8;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = 3;
                obj9 = obj8;
                if (((wad) obj3).d(this) == aoluVar) {
                    return aoluVar;
                }
                obj7 = obj9;
            }
            ((apdp) obj7).d();
            return aojh.a;
        } catch (java.lang.Throwable th5) {
            th = th5;
            obj6 = obj5;
            ((apdp) obj6).d();
            throw th;
        }
    }
}
