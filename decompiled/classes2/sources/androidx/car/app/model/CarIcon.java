package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class CarIcon {
    public static final int TYPE_ALERT = 4;
    public static final int TYPE_APP_ICON = 5;
    public static final int TYPE_BACK = 3;
    public static final int TYPE_COMPOSE_MESSAGE = 8;
    public static final int TYPE_CUSTOM = 1;
    public static final int TYPE_ERROR = 6;
    public static final int TYPE_MEDIA_PLAYBACK = 9;
    public static final int TYPE_PAN = 7;
    private static final int TYPE_RESOURCE = 2;
    private static final int TYPE_URI = 4;
    private final androidx.core.graphics.drawable.IconCompat mIcon;
    private final androidx.car.app.model.CarIconStyle mStyle;

    @java.lang.Deprecated
    private final androidx.car.app.model.CarColor mTint;
    private final int mType;
    public static final androidx.car.app.model.CarIcon APP_ICON = forStandardType(5);
    public static final androidx.car.app.model.CarIcon BACK = forStandardType(3);
    public static final androidx.car.app.model.CarIcon ALERT = forStandardType(4);
    public static final androidx.car.app.model.CarIcon ERROR = forStandardType(6);
    public static final androidx.car.app.model.CarIcon PAN = forStandardType(7);
    public static final androidx.car.app.model.CarIcon COMPOSE_MESSAGE = forStandardType(8);
    public static final androidx.car.app.model.CarIcon MEDIA_PLAYBACK = forStandardType(9);

    public CarIcon(androidx.core.graphics.drawable.IconCompat iconCompat, androidx.car.app.model.CarColor carColor, int i) {
        this.mType = i;
        this.mIcon = iconCompat;
        this.mTint = carColor;
        if (carColor == null) {
            this.mStyle = null;
            return;
        }
        defpackage.wk wkVar = new defpackage.wk(androidx.car.app.model.CarIconStyle.TINTED);
        wkVar.a(carColor);
        this.mStyle = new androidx.car.app.model.CarIconStyle(wkVar, (wl) null);
    }

    public static androidx.car.app.model.CarIcon createOriginalIcon(androidx.core.graphics.drawable.IconCompat iconCompat) {
        return new androidx.car.app.model.CarIcon(new defpackage.wj(iconCompat, androidx.car.app.model.CarIconStyle.ORIGINAL));
    }

    public static androidx.car.app.model.CarIcon createTintedIcon(androidx.core.graphics.drawable.IconCompat iconCompat, androidx.car.app.model.CarColor carColor) {
        j$.util.Objects.requireNonNull(iconCompat);
        j$.util.Objects.requireNonNull(carColor);
        defpackage.wk wkVar = new defpackage.wk(androidx.car.app.model.CarIconStyle.TINTED);
        wkVar.a(carColor);
        return new androidx.car.app.model.CarIcon(new defpackage.wj(iconCompat, new androidx.car.app.model.CarIconStyle(wkVar, (wl) null)));
    }

    private static androidx.car.app.model.CarIcon forStandardType(int i) {
        return new androidx.car.app.model.CarIcon(null, androidx.car.app.model.CarColor.DEFAULT, i);
    }

    private boolean iconCompatEquals(androidx.core.graphics.drawable.IconCompat iconCompat) {
        int iB;
        androidx.core.graphics.drawable.IconCompat iconCompat2 = this.mIcon;
        if (iconCompat2 == null) {
            if (iconCompat == null) {
                return true;
            }
        } else if (iconCompat != null && (iB = iconCompat2.b()) == iconCompat.b()) {
            if (iB != 2) {
                if (iB == 4) {
                    return j$.util.Objects.equals(this.mIcon.c(), iconCompat.c());
                }
                return true;
            }
            if (j$.util.Objects.equals(this.mIcon.i(), iconCompat.i()) && this.mIcon.a() == iconCompat.a()) {
                return true;
            }
        }
        return false;
    }

    private java.lang.Object iconCompatHash() {
        androidx.core.graphics.drawable.IconCompat iconCompat = this.mIcon;
        if (iconCompat == null) {
            return null;
        }
        int iB = iconCompat.b();
        if (iB != 2) {
            return iB == 4 ? this.mIcon.c() : java.lang.Integer.valueOf(iB);
        }
        return this.mIcon.i() + this.mIcon.a();
    }

    private static java.lang.String typeToString(int i) {
        switch (i) {
            case 1:
                return "CUSTOM";
            case 2:
            default:
                return "<unknown>";
            case 3:
                return "BACK";
            case 4:
                return "ALERT";
            case 5:
                return "APP";
            case 6:
                return "ERROR";
            case 7:
                return "PAN";
            case 8:
                return "COMPOSE_MESSAGE";
            case 9:
                return "MEDIA_PLAYBACK";
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.CarIcon) {
            androidx.car.app.model.CarIcon carIcon = (androidx.car.app.model.CarIcon) obj;
            if (this.mType == carIcon.mType && j$.util.Objects.equals(this.mTint, carIcon.mTint) && iconCompatEquals(carIcon.mIcon) && j$.util.Objects.equals(this.mStyle, carIcon.mStyle)) {
                return true;
            }
        }
        return false;
    }

    public androidx.core.graphics.drawable.IconCompat getIcon() {
        return this.mIcon;
    }

    public androidx.car.app.model.CarIconStyle getStyle() {
        androidx.car.app.model.CarIconStyle carIconStyle = this.mStyle;
        if (carIconStyle != null) {
            return carIconStyle;
        }
        if (this.mTint == null) {
            return null;
        }
        defpackage.wk wkVar = new defpackage.wk(androidx.car.app.model.CarIconStyle.TINTED);
        wkVar.a(this.mTint);
        return new androidx.car.app.model.CarIconStyle(wkVar, (wl) null);
    }

    @java.lang.Deprecated
    public androidx.car.app.model.CarColor getTint() {
        androidx.car.app.model.CarIconStyle carIconStyle = this.mStyle;
        return carIconStyle == null ? this.mTint : carIconStyle.getTint();
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.mType), this.mTint, iconCompatHash(), this.mStyle});
    }

    public java.lang.String toString() {
        return "[type: " + typeToString(this.mType) + ", tint: " + this.mTint + ", style: " + this.mStyle + ']';
    }

    public CarIcon(defpackage.wj wjVar) {
        int i = wjVar.a;
        this.mType = 1;
        this.mIcon = (androidx.core.graphics.drawable.IconCompat) wjVar.b;
        androidx.car.app.model.CarIconStyle carIconStyle = (androidx.car.app.model.CarIconStyle) wjVar.c;
        this.mStyle = carIconStyle;
        this.mTint = carIconStyle != null ? carIconStyle.getTint() : null;
    }

    public static androidx.car.app.model.CarIcon createTintedIcon(androidx.core.graphics.drawable.IconCompat iconCompat) {
        return new androidx.car.app.model.CarIcon(new defpackage.wj(iconCompat, androidx.car.app.model.CarIconStyle.TINTED));
    }

    private CarIcon() {
        this.mType = 1;
        this.mIcon = null;
        this.mTint = null;
        this.mStyle = null;
    }
}
