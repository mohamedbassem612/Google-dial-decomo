package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kkn implements defpackage.tem {
    private static final aimz b = aimz.i("com/android/dialer/calllog/search/CallLogSearchDataSource");
    public final tek a;
    private final defpackage.kkl c;
    private final rsr d;

    public kkn(rsr rsrVar, defpackage.kkl kklVar) {
        aooh.f(kklVar, "aclChanges");
        this.d = rsrVar;
        this.c = kklVar;
        this.a = tek.c;
    }

    @Override // defpackage.tem
    public final tek a() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.lang.CharSequence charSequence, aoln aolnVar) {
        defpackage.kkm kkmVar;
        defpackage.jpi jpiVar;
        if (aolnVar instanceof defpackage.kkm) {
            kkmVar = (defpackage.kkm) aolnVar;
            int i = kkmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kkmVar.c = i - Integer.MIN_VALUE;
            } else {
                kkmVar = new defpackage.kkm(this, aolnVar);
            }
        } else {
            kkmVar = new defpackage.kkm(this, aolnVar);
        }
        java.lang.Object obj = kkmVar.a;
        aolu aoluVar = aolu.a;
        int i2 = kkmVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                if (!android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(charSequence.toString())) {
                    return tgj.a;
                }
                rsr rsrVar = this.d;
                defpackage.jpi jpiVar2 = new defpackage.jpi(charSequence, 12);
                kkmVar.d = jpiVar2;
                kkmVar.c = 1;
                java.lang.Object objS = kcq.S(rsrVar, kkmVar);
                if (objS == aoluVar) {
                    return aoluVar;
                }
                obj = objS;
                jpiVar = jpiVar2;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jpiVar = kkmVar.d;
                aooc.af(obj);
            }
            return new tgl(aooc.k(new aoqt(new aoqr(new aoqt(aooc.l(ajsz.ch((java.lang.Iterable) obj), jpiVar), new defpackage.kbz(9), 1), 0), defpackage.bbb.g, 2)));
        } catch (java.lang.Exception e) {
            b.d().l("com/android/dialer/calllog/search/CallLogSearchDataSource", "performSearch", 60, "CallLogSearchDataSource.kt").u(e);
            return new tgi(e);
        }
    }

    @Override // defpackage.tem
    public final aoxh c(tei teiVar) {
        aooh.f(teiVar, "query");
        aoxh aoxhVar = this.c.a;
        java.lang.String str = teiVar.a;
        return aoxo.a(aoyc.a(new gdc(new defpackage.dqx(str, (aoln) null, 19), new defpackage.hlh(aoxhVar, str, 7), 7), new defpackage.dqx(this, (aoln) null, 20)));
    }
}
