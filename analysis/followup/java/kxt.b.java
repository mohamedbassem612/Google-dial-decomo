    @Override // defpackage.ajcb
    public final /* synthetic */ void b(Object obj) {
        switch (this.$cid) {
            case 0:
                kxx kxxVar = (kxx) this.a;
                kxxVar.h.set(true);
                if (((Boolean) obj).booleanValue()) {
                    kxxVar.g();
                    return;
                } else {
                    kxxVar.f();
                    return;
                }
            case 1:
                ((aimw) ((aimw) kva.a.b()).l("com/android/dialer/callrecording/impl/CallRecordingImpl$1", "onSuccess", 139, "CallRecordingImpl.java")).v("Deleted call recording");
                Object obj2 = this.a;
                ((kva) obj2).d.o(rmx.CALL_RECORDING_DELETED);
                return;
            case 2:
                Object obj3 = this.a;
                ((kxx) obj3).g.b(mce.CALL_RECORDING_DISCLOSURE_STARTED_PLAYING);
                return;
            case 3:
                Object obj4 = this.a;
                kxx kxxVar2 = (kxx) obj4;
                hxe hxeVar = (hxe) obj;
                kxxVar2.h.set(true);
                if (hxeVar == hxe.a) {
                    ((aimw) ((aimw) kxx.a.b()).l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController$3", "onSuccess", 285, "CallRecordingButtonController.java")).v("playing of starting audio finished.");
                    kxxVar2.g.b(mce.CALL_RECORDING_DISCLOSURE_FINISHED_PLAYING);
                    kxr kxrVar = kxxVar2.c;
                    kxxVar2.e(kxrVar);
                    ahoq ahoqVarW = ahvr.W(236, "CallRecordingButtonController_startCallRecording_startRecording");
                    try {
                        ahvr.J(kxrVar.c(((kxx) obj4).f), new kxu(this, 0), ((kxx) obj4).b);
                        ahoqVarW.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            ahoqVarW.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                return;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    ((lev) this.a).t.f();
                    return;
                }
                return;
            case 5:
                ((aimw) ((aimw) ljn.a.b()).l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedCallAvatarSessionManagerImpl$1", "onSuccess", 315, "ForkedCallAvatarSessionManagerImpl.java")).y("Finished preparing resources for channel %s", this.a);
                return;
            case 6:
                aooh.f((aojh) obj, "result");
                return;
            case 7:
                ((aimw) ((aimw) nyh.a.b()).l("com/android/dialer/duo/impl/MeetCallControllerImpl$1", "onSuccess", 180, "MeetCallControllerImpl.java")).v("startCall succeeded");
                nyh nyhVar = (nyh) this.a;
                nyhVar.g.i(null).b(mce.START_VIDEO_APP_CALL_SUCCESS);
                nyhVar.c.o(rmx.DUO_START_CALL);
                return;
            case 8:
                ((Boolean) obj).booleanValue();
                Object obj5 = this.a;
                ((nza) obj5).i.a(ajcm.a);
                return;
            case 9:
                Boolean bool = (Boolean) obj;
                ood oodVar = (ood) this.a;
                Boolean bool2 = oodVar.f;
                if (bool2 != null && !bool2.booleanValue() && bool.booleanValue()) {
                    oodVar.g.bm(rmu.FLIP_TO_SILENCE_ENABLED_IN_SETTINGS);
                }
                oodVar.f = bool;
                return;
            case 10:
                return;
            case 11:
                return;
            case 12:
                return;
            case 13:
                ((qdo) this.a).h = Optional.empty();
                return;
            case 14:
                ((aimw) ((aimw) qgd.a.b()).l("com/android/dialer/incall/rtt/service/RttInCallCachedDataLookup$1", "onSuccess", 82, "RttInCallCachedDataLookup.java")).v("Completed looking up the RttConfiguration");
                Object obj6 = this.a;
                ((qgd) obj6).c.n(qgd.b, rub.b);
                return;
            case Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                qmt qmtVar = (qmt) this.a;
                qmtVar.v.incrementAndGet();
                ((aimw) ((aimw) qmt.a.b()).l("com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier$1", "onSuccess", 256, "StatusBarNotifier.java")).v("Update finished successfully. updateInProgress set to false");
                qmtVar.g.set(false);
                if (qmtVar.h.getAndSet(false)) {
                    qmtVar.a();
                    return;
                }
                return;
            case 16:
                ((qay) this.a).a();
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                zpo zpoVar = (zpo) obj;
                int iOrdinal = zpoVar.ordinal();
                if (iOrdinal == 1 || iOrdinal == 3) {
                    Object obj7 = this.a;
                    ((tam) obj7).p.a(qbc.AUDIO_PROCESSING_STARTED_EVENT_FROM_INTERCEPTED_MODE);
                    return;
                } else if (iOrdinal != 11) {
                    ainm ainmVarD = tam.a.d();
                    ((aimw) ((aimw) ((aimw) ainmVarD).i(zct.b)).l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioSessionInitializer$1", "onSuccess", (char) 439, "RevelioSessionInitializer.java")).y("Audio processing started with unexpected call state: %s", zpoVar.name());
                    return;
                } else {
                    Object obj8 = this.a;
                    ((tam) obj8).p.a(qbc.AUDIO_PROCESSING_STARTED_EVENT_FROM_AUDIO_PROCESSING_STATE);
                    return;
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                Boolean bool3 = (Boolean) obj;
                ((aimw) ((aimw) tzr.a.b()).l("com/android/dialer/sonic/impl/service/SonicAnimationPlayer$1", "onSuccess", 82, "SonicAnimationPlayer.java")).y("animation play succeeded: %s", bool3);
                if (bool3.booleanValue()) {
                    return;
                }
                Object obj9 = this.a;
                ((tzr) obj9).e.a(mcd.SONIC_ANIMATION_PLAY_REQUEST_REJECTED);
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                Object obj10 = this.a;
                uhk uhkVar = (uhk) obj10;
                uhkVar.l.o(rmx.PATRONUS_SPAM_SUCCESSFULLY_QUERIED);
                uhkVar.n.n(uhk.b, rub.b);
                return;
            default:
                Object obj11 = this.a;
                ((uhk) obj11).n.n(uhk.c, rub.b);
                return;
        }
    }
