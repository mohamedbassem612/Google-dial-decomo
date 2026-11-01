    public final void g() {
        ((aimw) ((aimw) a.b()).l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController", "startCallRecording", 240, "CallRecordingButtonController.java")).v("start manual call recording");
        h(Instant.now().toEpochMilli());
        agsm.i(239, this.e.b(), "logCallRecordingRequested failed", new Object[0]);
        d();
        ahoq ahoqVarW = ahvr.W(240, "CallRecordingButtonController_startCallRecording_playStartingAudio");
        try {
            ajcq ajcqVarB = this.c.b();
            ahoqVarW.a(ajcqVarB);
            ibe ibeVar = new ibe(9);
            ajct ajctVar = this.b;
            ahvr.J(ahvr.I(ajcqVarB, ibeVar, ajctVar), new kxt(this, 2, (byte[]) null), ajctVar);
            ahvr.J(ahvr.I(ajcqVarB, new ibe(7), ajctVar), new kxt(this, 3, (char[]) null), ajctVar);
            ahoqVarW.close();
        } catch (Throwable th) {
            try {
                ahoqVarW.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
