package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class affh {
    public static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("(\\w+).*");

    public static java.lang.String a(java.util.List list) {
        if (list.isEmpty()) {
            return null;
        }
        return "transform=".concat(new defpackage.ahyj("+").b(list));
    }
}
