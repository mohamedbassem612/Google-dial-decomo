    /* JADX WARN: Type inference failed for: r3v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [aoin, java.lang.Object] */
    @Override // defpackage.zcs
    public final boolean a() {
        switch (this.$cid) {
            case 0:
                return afsq.bJ(this.a).booleanValue();
            case 1:
                return afsq.bJ(this.a).booleanValue();
            case 2:
                return afsq.bJ(this.a).booleanValue();
            case 3:
                return afsq.bJ(this.a).booleanValue();
            case 4:
                Optional optionalA = ((kwt) this.a).a();
                aooh.e(optionalA, "getCurrentLocaleForBuiltInAudioFile(...)");
                if (aooh.q(optionalA) != null) {
                    return true;
                }
                break;
            case 5:
                if (!((kwt) this.a).a().isPresent()) {
                    return true;
                }
                break;
            case 6:
                return ((kwt) this.a).a().isPresent();
            case 7:
                if (!((kwt) this.a).a().isPresent()) {
                    return true;
                }
                break;
            case 8:
                return ((kuw) this.a).a();
            case 9:
                return ((kuw) this.a).a();
            case 10:
                return ((kuw) this.a).a();
            case 11:
                return ((kuz) this.a).a();
            case 12:
                return ((kuz) this.a).a();
            case 13:
                return ((kuz) this.a).a();
            case 14:
                return ((kuz) this.a).a();
            case Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return ((kuz) this.a).a();
            case 16:
                return ((kuz) this.a).a();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((kuz) this.a).a();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((zjm) this.a).g().isPresent();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((lbw) this.a).a();
            default:
                return ((lbw) this.a).a();
        }
        return false;
    }
