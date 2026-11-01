package androidx.core.graphics.drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {
    public static final android.graphics.PorterDuff.Mode a = android.graphics.PorterDuff.Mode.SRC_IN;
    public int b;
    public java.lang.Object c;
    public byte[] d;
    public android.os.Parcelable e;
    public int f;
    public int g;
    public android.content.res.ColorStateList h;
    public android.graphics.PorterDuff.Mode i;
    public java.lang.String j;
    public java.lang.String k;

    public IconCompat() {
        this.b = -1;
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = a;
        this.j = null;
    }

    public static androidx.core.graphics.drawable.IconCompat e(android.os.Bundle bundle) {
        int i = bundle.getInt("type");
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(i);
        iconCompat.f = bundle.getInt("int1");
        iconCompat.g = bundle.getInt("int2");
        iconCompat.k = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.h = (android.content.res.ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.i = android.graphics.PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case androidx.car.app.model.Row.NO_DECORATION /* -1 */:
            case 1:
            case 5:
                iconCompat.c = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                android.util.Log.w("IconCompat", a.bj(i, "Unknown type "));
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.c = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.c = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static androidx.core.graphics.drawable.IconCompat f(android.graphics.Bitmap bitmap) {
        dzk.z(bitmap);
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(1);
        iconCompat.c = bitmap;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat g(android.content.Context context, int i) {
        dzk.z(context);
        return h(context.getResources(), context.getPackageName(), i);
    }

    public static androidx.core.graphics.drawable.IconCompat h(android.content.res.Resources resources, java.lang.String str, int i) {
        dzk.z(str);
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Drawable resource ID must not be 0");
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(2);
        iconCompat.f = i;
        if (resources != null) {
            try {
                iconCompat.c = resources.getResourceName(i);
            } catch (android.content.res.Resources.NotFoundException unused) {
                throw new java.lang.IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.c = str;
        }
        iconCompat.k = str;
        return iconCompat;
    }

    public final int a() {
        int i = this.b;
        if (i == -1) {
            return ft$.ExternalSyntheticApiModelOutline0.m((android.graphics.drawable.Icon) this.c);
        }
        if (i == 2) {
            return this.f;
        }
        toString();
        throw new java.lang.IllegalStateException("called getResId() on ".concat(toString()));
    }

    public final int b() {
        int i = this.b;
        return i == -1 ? ft$.ExternalSyntheticApiModelOutline0.m$1((android.graphics.drawable.Icon) this.c) : i;
    }

    public final android.net.Uri c() {
        int i = this.b;
        if (i == -1) {
            return ft$.ExternalSyntheticApiModelOutline0.m((android.graphics.drawable.Icon) this.c);
        }
        if (i == 4 || i == 6) {
            return android.net.Uri.parse((java.lang.String) this.c);
        }
        toString();
        throw new java.lang.IllegalStateException("called getUri() on ".concat(toString()));
    }

    public final android.os.Bundle d() {
        android.os.Bundle bundle = new android.os.Bundle();
        switch (this.b) {
            case androidx.car.app.model.Row.NO_DECORATION /* -1 */:
                bundle.putParcelable("obj", (android.os.Parcelable) this.c);
                break;
            case 0:
            default:
                throw new java.lang.IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (android.graphics.Bitmap) this.c);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (java.lang.String) this.c);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.c);
                break;
        }
        bundle.putInt("type", this.b);
        bundle.putInt("int1", this.f);
        bundle.putInt("int2", this.g);
        bundle.putString("string1", this.k);
        android.content.res.ColorStateList colorStateList = this.h;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        android.graphics.PorterDuff.Mode mode = this.i;
        if (mode != a) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public final java.lang.String i() {
        int i = this.b;
        if (i == -1) {
            return ft$.ExternalSyntheticApiModelOutline0.m((android.graphics.drawable.Icon) this.c);
        }
        if (i == 2) {
            java.lang.String str = this.k;
            return (str == null || android.text.TextUtils.isEmpty(str)) ? ((java.lang.String) this.c).split(":", -1)[0] : this.k;
        }
        toString();
        throw new java.lang.IllegalStateException("called getResPackage() on ".concat(toString()));
    }

    public final java.lang.String toString() {
        java.lang.String str;
        if (this.b == -1) {
            return java.lang.String.valueOf(this.c);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Icon(typ=");
        switch (this.b) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((android.graphics.Bitmap) this.c).getWidth());
                sb.append('x');
                sb.append(((android.graphics.Bitmap) this.c).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.k);
                sb.append(" id=");
                sb.append(java.lang.String.format("0x%08x", java.lang.Integer.valueOf(a())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f);
                if (this.g != 0) {
                    sb.append(" off=");
                    sb.append(this.g);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.c);
                break;
        }
        if (this.h != null) {
            sb.append(" tint=");
            sb.append(this.h);
        }
        if (this.i != a) {
            sb.append(" mode=");
            sb.append(this.i);
        }
        sb.append(')');
        return sb.toString();
    }

    public IconCompat(int i) {
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = a;
        this.j = null;
        this.b = i;
    }
}
