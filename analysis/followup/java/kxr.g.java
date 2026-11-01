    /* JADX WARN: Type inference failed for: r0v5, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [aoss, java.lang.Object] */
    private final ajcq g(kxq kxqVar) {
        if (!((Boolean) this.w.a()).booleanValue()) {
            gou gouVar = this.y;
            ajcq ajcqVarI = ahvr.I(aosv.F(gouVar.c, 0, new hqi(gouVar, (aoln) null, 16), 3), new kxm(kxqVar, 5), this.h);
            ajcq ajcqVarA = this.l.a();
            return ahvr.ak(ajcqVarA, ajcqVarI).p(ahqx.b(new kff(this, ajcqVarI, ajcqVarA, kxqVar, 2)), this.d);
        }
        boolean zEquals = kxqVar.equals(kxq.b);
        klt kltVar = this.x;
        ajcq ajcqVarF = zEquals ? aosv.F(kltVar.a, 0, new ksy(kltVar, (aoln) null, 3, (byte[]) null), 3) : aosv.F(kltVar.a, 0, new ksy(kltVar, (aoln) null, 2), 3);
        ((aimw) ((aimw) a.b()).l("com/android/dialer/callrecording/impl/service/CallRecorder", "playAudio", 455, "CallRecorder.java")).I("playAudio %s -> %s ", (kxq) this.k.getAndSet(kxqVar), kxqVar);
        ahvr.J(ajcqVarF, ahqx.f(new kxp(this, kxqVar, 0)), this.h);
        return ajcqVarF;
    }
