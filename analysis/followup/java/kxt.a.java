    @Override // defpackage.ajcb
    public final void a(Throwable th) {
        switch (this.$cid) {
            case 0:
                ((aimw) ((aimw) ((aimw) ((aimw) kxx.a.c()).i(zct.b)).k(th)).l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController$1", "onFailure", (char) 202, "CallRecordingButtonController.java")).v("failed to getCallRecordingDisclaimerAgreed");
                kxx kxxVar = (kxx) this.a;
                kxxVar.h.set(true);
                kxxVar.f();
                break;
            case 1:
                ((aimw) ((aimw) ((aimw) ((aimw) kva.a.c()).i(zct.b)).k(th)).l("com/android/dialer/callrecording/impl/CallRecordingImpl$1", "onFailure", (char) 149, "CallRecordingImpl.java")).v("Failed to delete call recordings");
                Object obj = this.a;
                ((kva) obj).d.o(rmx.CALL_RECORDING_DELETION_FAILED);
                break;
            case 2:
                Object obj2 = this.a;
                ((kxx) obj2).g.a(mcd.CALL_RECORDING_DISCLOSURE_FAILED_TO_PLAY);
                break;
            case 3:
                Object obj3 = this.a;
                kxx kxxVar2 = (kxx) obj3;
                kxxVar2.g.a(mcd.CALL_RECORDING_DISCLOSURE_FAILED_TO_PLAY);
                ((aimw) ((aimw) ((aimw) ((aimw) kxx.a.c()).i(zct.b)).k(th)).l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController$3", "onFailure", (char) 321, "CallRecordingButtonController.java")).v("failed to play starting audio");
                kxxVar2.h.set(true);
                kxxVar2.j.set(Optional.of(kxw.a));
                kxxVar2.n.a(ajcm.a);
                break;
            case 4:
                ((aimw) ((aimw) ((aimw) ((aimw) lev.a.c()).m(aioa.MEDIUM)).k(th)).l("com/android/dialer/callscreen/impl/service/CallScreenController$1", "onFailure", (char) 269, "CallScreenController.java")).v("Unable to determine hasLegacyCallScreenCall");
                break;
            case 5:
                ((aimw) ((aimw) ((aimw) ((aimw) ljn.a.d()).i(zct.b)).k(th)).l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedCallAvatarSessionManagerImpl$1", "onFailure", 324, "ForkedCallAvatarSessionManagerImpl.java")).y("Failed to prepare resources for channel %s", this.a);
                break;
            case 6:
                aooh.f(th, "t");
                ((aimw) ((aimw) ((aimw) nej.a.c()).k(th)).j(zct.a, Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController$onCallScopeAdded$<anonymous>", "onFailure", 415, "DobbyLifecycleController.kt")).v("Failed to set initial lifecycle state.");
                Object obj4 = this.a;
                ((nej) obj4).n.a(mcd.DOBBY_FAILED_TO_SET_INITIAL_LIFECYCLE_STATE);
                break;
            case 7:
                nyh nyhVar = (nyh) this.a;
                Toast.makeText(nyhVar.b, R.string.start_duo_call_failed, 0).show();
                nyhVar.g.i(null).a(mcd.START_VIDEO_APP_CALL_ERROR);
                nyhVar.c.o(rmx.MEET_START_CALL_FAILED);
                ((aimw) ((aimw) ((aimw) ((aimw) nyh.a.c()).i(zct.b)).k(th)).l("com/android/dialer/duo/impl/MeetCallControllerImpl$1", "onFailure", (char) 194, "MeetCallControllerImpl.java")).v("startCall failed");
                break;
            case 8:
                aooh.f(th, "t");
                ((nza) this.a).g.set(null);
                ((aimw) ((aimw) ((aimw) nza.a.c()).i(zct.b)).k(th).l("com/android/dialer/duo/tidepods/DuoUpgradeSupportedCache$isUpgradeSupported$<anonymous>", "onFailure", 95, "DuoUpgradeSupportedCache.kt")).v("isDuoUpgradeSupported failed.");
                break;
            case 9:
                ((aimw) ((aimw) ((aimw) ((aimw) ood.a.c()).i(zct.b)).k(th)).l("com/android/dialer/fliptosilence/impl/FlipToSilenceGrowthKitLogger$1", "onFailure", 'e', "FlipToSilenceGrowthKitLogger.java")).v("Unable to read Flip To Silence user settings");
                break;
            case 10:
                Object obj5 = this.a;
                ((mba) ((wjc) obj5).f).a(mcd.ACCEPT_CALL_FROM_ANSWER_SCREEN_FAILURE);
                break;
            case 11:
                Object obj6 = this.a;
                ((mba) ((wjc) obj6).f).a(mcd.ACCEPT_RTT_CALL_FROM_ANSWER_SCREEN_FAILURE);
                break;
            case 12:
                Object obj7 = this.a;
                ((mba) ((wjc) obj7).f).a(mcd.REJECT_CALL_FROM_ANSWER_SCREEN_FAILURE);
                break;
            case 13:
                ((qdo) this.a).h = Optional.empty();
                break;
            case 14:
                ((aimw) ((aimw) qgd.a.b()).l("com/android/dialer/incall/rtt/service/RttInCallCachedDataLookup$1", "onFailure", 88, "RttInCallCachedDataLookup.java")).v("Failed looking up the RttConfiguration");
                Object obj8 = this.a;
                ((qgd) obj8).c.n(qgd.b, rub.c);
                break;
            case Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                ((aimw) ((aimw) ((aimw) ((aimw) qmt.a.c()).i(zct.b)).k(th)).l("com/android/dialer/incall/statusbarnotification/ui/StatusBarNotifier$1", "onFailure", (char) 269, "StatusBarNotifier.java")).v("failed updating model and notification");
                Object obj9 = this.a;
                qmt qmtVar = (qmt) obj9;
                qmtVar.e().a(mcd.PRODUCE_ANSWER_MODEL_FAILURE);
                qmtVar.g.set(false);
                Optional optional = (Optional) qmtVar.o.get();
                qmp qmpVar = new qmp(obj9, 9);
                if (true == optional.isPresent()) {
                    Object obj10 = optional.get();
                    Optional optionalH = ((qmt) qmpVar.a).h((String) obj10);
                    if (true == optionalH.isPresent()) {
                        ((qko) optionalH.get()).r.c(qbc.STATUS_BAR_NOTIFICATION_MODEL_FAILED);
                    }
                }
                if ((th instanceof TimeoutException) && ((Long) qmtVar.m.a()).longValue() > 0) {
                    qmtVar.n.o(rmx.CALL_NOTIFICATION_FAILED_WITH_TIMEOUT);
                    qmtVar.h.set(false);
                    qmtVar.y.a(ajcm.a);
                } else if (qmtVar.h.getAndSet(false)) {
                    qmtVar.a();
                }
                break;
            case 16:
                if (!(th instanceof CancellationException)) {
                    ((aimw) ((aimw) ((aimw) ((aimw) qvx.a.c()).i(zct.b)).k(th)).l("com/android/dialer/incall/voice/buttons/SwapSimButtonController$1", "onFailure", (char) 130, "SwapSimButtonController.java")).v("failed to swap sim.");
                }
                ((qay) this.a).a();
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((aimw) ((aimw) ((aimw) ((aimw) tam.a.c()).i(zct.b)).k(th)).l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioSessionInitializer$1", "onFailure", (char) 452, "RevelioSessionInitializer.java")).v("Unable to log audio processing started impression.");
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((aimw) ((aimw) ((aimw) tzr.a.c()).k(th)).l("com/android/dialer/sonic/impl/service/SonicAnimationPlayer$1", "onFailure", '[', "SonicAnimationPlayer.java")).v("Animation play has failed.");
                Object obj11 = this.a;
                tzr tzrVar = (tzr) obj11;
                tzrVar.e.a(mcd.SONIC_ANIMATION_PLAY_REQUEST_FAILED);
                tzrVar.d.a(th);
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                Object obj12 = this.a;
                ((uhk) obj12).n.n(uhk.b, rub.c);
                break;
            default:
                Object obj13 = this.a;
                ((uhk) obj13).n.n(uhk.c, rub.c);
                break;
        }
    }
