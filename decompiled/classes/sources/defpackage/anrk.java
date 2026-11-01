package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anrk extends java.net.SocketAddress {
    private static final long serialVersionUID = 0;
    public final android.content.Intent a;
    public final android.os.UserHandle b;

    public anrk(android.content.Intent intent, android.os.UserHandle userHandle) {
        if (intent.getComponent() == null && intent.getPackage() == null) {
            throw new java.lang.IllegalArgumentException("'bindIntent' must be explicit. Specify either a package or ComponentName.");
        }
        this.a = intent;
        this.b = userHandle;
    }

    public static defpackage.anrk a(android.content.ComponentName componentName) {
        return new defpackage.anrk(new android.content.Intent("grpc.io.action.BIND").setComponent(componentName), null);
    }

    public static defpackage.anrk b(android.content.Context context) {
        return a(new android.content.ComponentName(context, context.getClass()));
    }

    public final java.lang.String c() {
        android.content.Intent intent = this.a;
        return intent.getPackage() != null ? intent.getPackage() : intent.getComponent().getPackageName();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.anrk)) {
            return false;
        }
        defpackage.anrk anrkVar = (defpackage.anrk) obj;
        return this.a.filterEquals(anrkVar.a) && j$.util.Objects.equals(this.b, anrkVar.b);
    }

    public final int hashCode() {
        android.content.Intent intent = this.a;
        if (intent.getPackage() != null) {
            intent = intent.cloneFilter().setPackage(null);
        }
        return intent.filterHashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AndroidComponentAddress[");
        android.os.UserHandle userHandle = this.b;
        if (userHandle != null) {
            sb.append(userHandle);
            sb.append('@');
        }
        sb.append(this.a);
        sb.append(']');
        return sb.toString();
    }
}
