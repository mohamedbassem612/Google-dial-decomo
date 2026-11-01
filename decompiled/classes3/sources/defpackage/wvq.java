package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wvq {
    public static final aimz a = aimz.i("com/android/incallui/atlas/detection/processors/DetectionMetricsLogger");
    public final aoin b;
    public final ajct c;
    public final defpackage.wxm d;
    public final ajwr j = new ajwr();
    public final akzx h = defpackage.wvi.a.m();
    public final java.util.Deque e = new java.util.ArrayDeque();
    public final akzx i = defpackage.amob.a.m();
    public boolean f = false;
    public j$.util.OptionalLong g = j$.util.OptionalLong.empty();

    public wvq(aoin aoinVar, ajct ajctVar, defpackage.wxm wxmVar) {
        this.b = aoinVar;
        this.c = ajctVar;
        this.d = wxmVar;
    }

    public final ajcq a(java.util.concurrent.Callable callable) {
        return this.j.d(ahqx.i(new defpackage.whv(this, callable, 14)), this.c);
    }

    public final defpackage.amob b(long j, long j2) {
        akzx akzxVarM = defpackage.amob.a.m();
        akzxVarM.u();
        defpackage.amob amobVar = (defpackage.amob) akzxVarM.b;
        amobVar.b |= 1;
        amobVar.c = j;
        akzxVarM.u();
        defpackage.amob amobVar2 = (defpackage.amob) akzxVarM.b;
        amobVar2.b |= 2;
        amobVar2.d = j2;
        while (true) {
            java.util.Deque deque = this.e;
            if (deque.isEmpty() || ((defpackage.amob) deque.getLast()).c < j || ((defpackage.amob) deque.getLast()).c >= j2) {
                break;
            }
            defpackage.amob amobVar3 = (defpackage.amob) deque.removeLast();
            int i = amobVar3.i + ((defpackage.amob) akzxVarM.b).i;
            akzxVarM.u();
            defpackage.amob amobVar4 = (defpackage.amob) akzxVarM.b;
            amobVar4.b |= 64;
            amobVar4.i = i;
            int i2 = amobVar3.h + amobVar4.h;
            akzxVarM.u();
            defpackage.amob amobVar5 = (defpackage.amob) akzxVarM.b;
            amobVar5.b |= 32;
            amobVar5.h = i2;
            int i3 = amobVar3.g + amobVar5.g;
            akzxVarM.u();
            defpackage.amob amobVar6 = (defpackage.amob) akzxVarM.b;
            amobVar6.b |= 16;
            amobVar6.g = i3;
            int i4 = amobVar3.f + amobVar6.f;
            akzxVarM.u();
            defpackage.amob amobVar7 = (defpackage.amob) akzxVarM.b;
            amobVar7.b |= 8;
            amobVar7.f = i4;
            int i5 = amobVar3.e + amobVar7.e;
            akzxVarM.u();
            defpackage.amob amobVar8 = (defpackage.amob) akzxVarM.b;
            amobVar8.b |= 4;
            amobVar8.e = i5;
            long j3 = amobVar3.j + amobVar8.j;
            akzxVarM.u();
            defpackage.amob amobVar9 = (defpackage.amob) akzxVarM.b;
            amobVar9.b |= 128;
            amobVar9.j = j3;
        }
        return (defpackage.amob) akzxVarM.p();
    }

    public final void c(defpackage.alex alexVar) {
        agsm.i(1119, a(new defpackage.whv(this, alexVar, 12)), "recordLoggingEvent failed", new java.lang.Object[0]);
    }

    public final void d(long j, j$.util.Optional optional, j$.util.Optional optional2) {
        akzx akzxVar = this.i;
        long j2 = j - ((defpackage.amob) akzxVar.b).c;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        if (j2 >= 1000) {
            this.e.addLast((defpackage.amob) akzxVar.p());
            akzxVar.x();
            akzxVar.u();
            defpackage.amob amobVar = (defpackage.amob) akzxVar.b;
            amobVar.b |= 1;
            amobVar.c = j;
        }
        if (optional2.isPresent()) {
            int iOrdinal = ((defpackage.wxk) optional2.orElseThrow()).ordinal();
            if (iOrdinal == 0) {
                int i = ((defpackage.amob) akzxVar.b).i + 1;
                akzxVar.u();
                defpackage.amob amobVar2 = (defpackage.amob) akzxVar.b;
                amobVar2.b |= 64;
                amobVar2.i = i;
            } else if (iOrdinal == 1) {
                int i2 = ((defpackage.amob) akzxVar.b).e + 1;
                akzxVar.u();
                defpackage.amob amobVar3 = (defpackage.amob) akzxVar.b;
                amobVar3.b |= 8;
                amobVar3.f = i2;
            } else if (iOrdinal == 2) {
                int i3 = ((defpackage.amob) akzxVar.b).e + 1;
                akzxVar.u();
                defpackage.amob amobVar4 = (defpackage.amob) akzxVar.b;
                amobVar4.b |= 4;
                amobVar4.e = i3;
            } else if (iOrdinal == 3) {
                int i4 = ((defpackage.amob) akzxVar.b).h + 1;
                akzxVar.u();
                defpackage.amob amobVar5 = (defpackage.amob) akzxVar.b;
                amobVar5.b |= 32;
                amobVar5.h = i4;
            } else if (iOrdinal == 4) {
                int i5 = ((defpackage.amob) akzxVar.b).g + 1;
                akzxVar.u();
                defpackage.amob amobVar6 = (defpackage.amob) akzxVar.b;
                amobVar6.b |= 16;
                amobVar6.g = i5;
            }
        }
        if (optional.isPresent()) {
            long jLongValue = ((defpackage.amob) akzxVar.b).j + ((java.lang.Long) optional.orElseThrow()).longValue();
            akzxVar.u();
            defpackage.amob amobVar7 = (defpackage.amob) akzxVar.b;
            amobVar7.b |= 128;
            amobVar7.j = jLongValue;
        }
    }
}
